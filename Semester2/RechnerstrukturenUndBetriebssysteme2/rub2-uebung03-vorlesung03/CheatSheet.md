### Inter Process Communication (IPC)
Synchronization and communication of processes and threads.

### Synchronization/Communication
Synchronizing processes/threads to avoid unnecessary calls
e.g. notify() in synchronized block like in java

### Communication
Exchange of information between processes/threads. Not necessarily synchronized.

### POSIX / ANSI C

ANSI C is standard C, POSIX C is more powerful, as far as my understanding goes.

POSIX: 

https://riptutorial.com/posix/example/15910/simple-mutex-usage

Mutex: synchronization primitive for mutual exclusion
e.g. want to increment then decrement asynchronously but first increment all the way up
then decrement.

Condition Variable: another synchronization primitive to synchronize partially
e.g. wait() and notify()
https://stackoverflow.com/questions/20772476/when-to-use-pthread-condition-variables

### Filedescriptors

Filedescriptor table has:
- Integer value
- Name
- <unistd.h> symbolic constant (e.g. STDIN_FILENO, STDOUT_FILENO, STDERR_FILENO)
- <stdio.h> file stream (e.g. stdin, stdout, stderr)

https://en.wikipedia.org/wiki/File_descriptor

Lifecycle:
- open(const char *pathname, int flags, @InOverloadedMethod mode_t mode) / create (const char *pathname, mode_t mode)
- action: read(int filedesc, const void *buf, size_t count) / write(int filedesc, const void *buf, size_t count)
- close(int filedesc)

Access to files via filedescriptors:
- Datatype int
- Default descriptors:
  - STDIN_FILENO //input
  - STDOUT_FILENO //output
  - STDERR_FILENO // Error output
- everything is a file, this I/O is base for inter process communication

### File I/O

- Descriptors: see above
- Flags:
  - O_RDONLY //read-only
  - O_WRONLY //write-only
  - O_RDWR //read-write
- buf: Buffer for stat structure see previous practice and CheatSheet.md stat struct

### Pipes and FIFO

Pipe: FIFO but only parent/child process communication because not actually
added to filesystem
Fifo: communication between any process, created with name on filesystem

Full-duplex: simultaneous two-way communication
Half-duplex: two-way communication in one direction at a time

FIFO/Pipe write process closed, read-Prozess gets EOF

FIFO/Pipe read process closed, process killed, signal SIGPIPE to write process

#### Filedescriptor parameter
Here "inverted" because pipe gets input when reading, thus
STDIN_FILENO
Pipe produces output when writing, thus
STDOUT_FILENO

#### dup() and dup2()

dup( int filedesc) creates new filedescriptor pointing to same file

dup2(int filedesc, int newFiledesc) does the same but you choose new value for new filedescriptor

### execlp()
Executes file (like in command line, thus accepts parameters like in CLI)
https://linux.die.net/man/3/execlp

Sidenote: cat > filename -> output file with name, cat < file input file with name and output on console

### Stream I/O
Like File I/O but easier. ANSI-C Standard.
Working with a filepointer FILE* (pointer)

Default streams open for any file:

stdin, stdout, stderr - for more info see last practice CheatSheet.md

Lifecycle:

- fopen(const char *path, const char *mode), mode: r, r+, w, w+, a, a+ 
  - \+ is for update
- actions e.g.: 
- fgets(char *s, int n, FILE *stream) 
  - getting file contents until n
- fprintf(FILE *stream, const char *format, ...)
  - print contents
- fflush(FILE *stream)
  - output buffer
- fclose(FILE *stream)

### Changing File I/O to Stream I/O and the other way around
Filedesc to FILE*:

*fdopen(int filedesc, const char *mode)

FILE* to Filedesc:

fileno(FILE *stream)

### FIFO for interprocess communication (afaik)
create FIFO:

mkfifo(const char *pathname, mode_t mode)

delete FIFO:

unlink()

Basically same functionality as files otherwise

### Client-Server Architecture

Client:
- application on client
- makes call gets service from server

Service:
- Service application providing service, running on servers

Server:
- Server running on some machine, provides Service application
- provides service of service application to any unknown client after call
- forks for every call to respond async

### Shared memory

Memory shared by processes/threads for communication between them


### Pipe vs FIFO vs Shared memory

Pipe: 
- anonymous 
- communication between child and parent processes only
- does memory allocation etc. automatically
- lasts only as long as process, just passes data along and doesn't store

Fifo:
- not anonymous
- written to filesystem
- has to be open on both ends (read-write)
- communication between any process
- stores data, existence independent of process

Shared memory: 
- fastest, can manually allocate memory, more control
- can share between many applications
- data stored, existence independent of process
- doesn't automatically delete or clear contents, will only clear if garbage collected

### Übung 3
#### Aufgabe 1
SIGTERM vs SIGKILL (kill vs kill -9)

Standard C applications have a header file that contains the steps a process follows,
when receiving a signal.

SIGTERM will be handled by said header file, as defined there.
Thus the process will end as it would if you closed the application or whatever the process belongs to.

SIGKILL goes directly to the kernel init, where init will stop the process.
It will not follow any steps defined in the header file. 
The process will be killed and this action cannot be blocked or ignored by the process itself.
Process doesn't get the opportunity to catch the signal and respond to it.

However: Zombie processes e.g. which we will look into later, or processes in so called uninterruptable sleep
cannot be killed by the kernel.

https://major.io/2010/03/18/sigterm-vs-sigkill/
#### Aufgabe 2
SIGSTOP and SIGCONT

SIGSTOP pauses the process in current state. It cannot be caught or ignored.
It will only resume if receiving a signal called SIGCONT.

SIGCONT sent to a process that is stopped, will make it resume. 

https://major.io/2009/06/15/two-great-signals-sigstop-and-sigcont/

#### Aufgabe 3

#### Signals
https://www.ic.unicamp.br/~celio/mc514/linux/linux_pgsignals.html

According to this list, SIGKILL and SIGSTOP cannot be caught, in POSIX C.

#### Aufgabe 4

A zombie process completed execution via exit call but still remains in process table.
It is a process in terminated state. Once the exit status is read via the wait system call,
the process gets removed. Every process first becomes a zombie process before being deleted.

If it doesn't get deleted that means issues.

https://en.wikipedia.org/wiki/Zombie_process

Avoiding child processes

1. As stated above, you can make the parent process wait for the child to finish with wait()
The process will then be removed after exiting.

```c

// A C program to demonstrate working of
// fork()/wait() and Zombie processes
#include<stdio.h>
#include<unistd.h>
#include<sys/wait.h>
#include<sys/types.h>
 
int main()
{
    int i;
    int pid = fork();
    if (pid==0)
    {
        for (i=0; i<20; i++)
            printf("I am Child\n");
    }
    else
    {
        wait(NULL);
        printf("I am Parent\n");
        while(1);
    }
}
```

2. Ignoring SIGCHLD signal

In this case if we call signal(SIGCHLD, SIG_IGN), the SIGCHLD signal sent to the parent after child has terminated
is ignored. Downside: Parent doesn't know about exit status of child.

3. Signal handling

We can create a function to handle the SIGCHLD signal.
The function can be called in signal(SIGCHLD, functionHere).
The function itself can call wait() and thus collect the exit status of child
immediately.

```c

// A C program to demonstrate handling of
// SIGCHLD signal to prevent Zombie processes.
#include<stdio.h>
#include<unistd.h>
#include<sys/wait.h>
#include<sys/types.h>
 
void func(int signum)
{
    wait(NULL);
}
 
int main()
{
    int i;
    int pid = fork();
    if (pid == 0)
        for (i=0; i<20; i++)
            printf("I am Child\n");
    else
    {
        signal(SIGCHLD, func);
        printf("I am Parent\n");
        while(1);
    }
}
```

https://www.geeksforgeeks.org/zombie-processes-prevention/
https://www.tutorialspoint.com/c_standard_library/c_function_signal.htm

#### Aufgabe 5

```c
void (*signal(int sig, void (*func)(int)))(int)
```

signal() is a C Standard Library function used for handling of signals.

It takes a signal and a callback function to handle said signal as parameter.
It returns the previous value of signal handler or SIG_ERR.

#### Aufgabe 6 und 7

Main Process = 286162

1. Parent = Main Process
- pid2 fork() -> 0 to new process -> pid2 = 0
- pid0 & pid 1 cloned 
- Result: pid1 == getppid() -> v2++; 
- sleep(x) waiting for signal

2. Parent = Main Process
- pid0 fork() -> 0 to new process -> pid0 = 0
- pid1 & pid2 cloned
- Result: pid1 == getpid -> v2++

3. Parent = 2. Child 
- pid0 & pid1 cloned, pid2 -> 0 to new process
- Result: pid0 == pid2 -> v1++
- sleep(x) waiting for signal
- exiting -> signal received -> handler -> v0++

Main process
- REsult: pid1 == getpid() -> v2++
- killing 3rd child before it finished sleep and sending signal -> 3rd child v0++
- waiting for children to finish
- pid0 > 0 -> v1++
- waiting for child processes to finish
- done









