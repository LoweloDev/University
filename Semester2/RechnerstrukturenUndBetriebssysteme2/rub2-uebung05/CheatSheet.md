### File descriptor table and forking

FD Table inherited from parent.

Dup() to redirect.

dup2(oldfd, newfd) closes given newfd if newfd fileDesc already existing to put create it again and point to oldfd contents.

### Aufgabe 5.1

```c
#include <signal.h>
#include <unistd.h>
#include <fcntl.h>
#include <wait.h>

// ls -l /etc | wc -l 2>x >y  --- where 2 is useless, as far as I am aware. It's just trying to call a file that doesn't exist.

int main() {
pid_t pid;
int fd[2], fdf;
pid = fork();
if (pid == 0) {

pipe(fd);


pid = fork();
if (pid == 0) {
close(fd[0]);
// stuff put into pipeline2 redirected to actual STDOUT of child process.
// writes to pipe
dup2(fd[1], 1);
close(fd[1]);
execlp("ls", "ls", "-l", "/etc", NULL);
}

// stuff coming from being put into pipeline redirected into actual STDIN
// reads from pipe
dup2(fd[0], 0);
close(fd[1]);
close(fd[0]);

/* Useless block. Creates empty file that doesn't contain anything.*/
fdf = open("x", O_WRONLY | O_CREAT, 0600);
close(fdf);
/* end of useless block*/

// now since input of this parent is what came out of pipe (ls -l /etc) due to redirection above, we can create file on output.
fdf = open("y", O_WRONLY | O_CREAT, 0600);
// writes to the file
dup2(fdf, 1);
close(fdf);
execlp("wc", "wc", "-l", NULL);
}
wait(NULL);
}
```

Child pipe:
0 = closed;
1 = output of execlp redirected to STDOUT of child process
   
Parent pipe: 0 = Output of childprocess (STDOUT), redirected to actual STDIN of main process
1 = closed

Main Process: 0 = input of pipe which is output of childprocess
1 = Output file, also containing execlp("wc"... "-l") as well as taking into account output of child process, since it was redirected to STDIN of the main process.


### Aufgabe 5.2

Pipe: 
Pro: 
- anonymous
- does memory allocation automatically
- lasts only as long as process, just passes data along and doesn't store

Contra:
- anonymous
- communication between child and parent processes only
- does memory allocation automatically
- lasts as long as process, just passes data along and doesn't store

Fifo:
Pro:
- not anonymous
- communication between any processes
- stores data, existence independent of process

Contra:
- not anonymous, written fo filesystem
- has to be open on both ends (read-write)
- stores data, existence independent of process

### Aufgabe 5.3

System calls used for fifo include:
- mkfifo() to create fifo and write it to filesystem at path
- open() to open file, write() to write into fifo, or read() to read from fifo
- close() to close fileDesc/file
- delete fifo unlink()

### Aufgabe 5.4

Fifo needs both ends open thus, following is synchronized:

If FIFO RDONLY -> blocks open() until WRITE open.
If FIFO WRONLY -> blocks open() until READ open.

Fifo synchronization mechanics otherwise:
If FIFO FULL -> blocks WRITE.
If FIFO EMPTY -> blocks READ.
If WRITE (fd[1]) closed -> READ receives EOF.
If READ (fd[0]) closed (gets EOF) -> WRITE receives SIGPIPE -> kills process

### Aufgabe 5.5

Because they are anonymous, not written to filesystem and do only allow communication between,
child and parent processes. 

In client-server comms you have to communicate between,
client side parent and potentially their child processes on the one side, and server side, which
cannot happen if you are anonymous.
