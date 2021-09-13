### Fork-exec design pattern

Fork-exec is a design pattern commonly used in Unix in which a running process spawns a child,
for each command or seperate procedure if you will.
This has not been mentioned in any of our classes as far as I am aware and is extremely important in my view, for full understanding
that the way the code in C often was presented is not a necessity for correct results in most of the tasks, it is a design pattern, for
better performance and simpler handling.

https://en.wikipedia.org/wiki/Fork%E2%80%93exec


### Aufgabe 4.1

```c
int main() {
    char string[] = "testString\n";
    char readString[strlen(string)];
    int filedescTable[2];
    int pipeline = pipe(filedescTable);

    printf("%d", pipeline);
    write(filedescTable[1], &string, strlen(string));
    close(filedescTable[1]);

    read(filedescTable[0], &readString, strlen(string));
    readString[strlen(string) - 1] = '\0';
    printf("%s", readString);

    return 0;
}
```

### Aufgabe 4.2

```c
#include <sys/wait.h>
#include <unistd.h>
#include <string.h>

// fork-exec design pattern, see cheatsheet

int main(void) {
int fileDesc[2];
int fileDesc2[2];
// reminder: string = chararray
char  writeString[] = "hello world\n", readString[strlen(writeString)], readStringParent[strlen(writeString)];
pipe(fileDesc);
pid_t pid = fork();

// parent
if (pid > 0) {
close(fileDesc[0]);
write(fileDesc[1], &writeString, strlen(writeString));
}

//child
else if (pid == 0) {
close(fileDesc[1]);
int bytes = read(fileDesc[0], &readString, strlen(writeString));
close(fileDesc[0]); // not needed anymore
pipe(fileDesc2);
write(fileDesc2[1], &readString, bytes);
close(fileDesc2[1]); // not needed anymore
}

int bytes = read(fileDesc2[0], &readStringParent, strlen(writeString));
close(fileDesc2[0]);
write(STDOUT_FILENO, &readStringParent, bytes);


// wait for child
wait(NULL);
return 0;
}
```

### Aufgabe 4.3

see main.c for code

### File Desc Table info to 4.2 and 4.3

Associations:

General = process FD;
PipeX = custom declarated Pipe FD array;
FileDesc2 = 

Main Process:
General:
- 0
- 1 -> written to at end of program
- 2

Pipe1:
- 0 -> closed -> available
- 1
- 2

Pipe2:
- 0 -> read to then closed -> available
- 1 -> closed -> available
- 2

Child Process:
General:
- 0
- 1 
- 2

Pipe1:
- 0 -> was available, thus taken by STDIN due to fork(); -> read from then close -> available
- 1 -> closed -> available
- 2

Pipe2: 
- 0 
- 1 -> written to then closed -> available
- 2

Done.