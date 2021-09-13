#include <sys/wait.h>
#include <unistd.h>
#include <string.h>
#define BUFSIZE 4096

// Aufgabe 4.3 und 4.2

// fork-exec design pattern, see cheatsheet

int main() {
    int fileDesc[2], fileDesc2[2];
    // reminder: string = chararray
    char readString[BUFSIZE], readStringParent[BUFSIZE] = {"\0"};

    if (fork() == 0) {
        pipe(fileDesc);
        pid_t pid = fork();

        // child 1
        if (pid > 0) {
            close(fileDesc[0]);
            dup2(fileDesc[1], 1);
            close(fileDesc[1]);
            // after execlp you cannot execute any other code. So I had to make it a child process.
            execlp("../rub2-praktikum05/cmake-build-debug/rub2_praktikum05", "../rub2-praktikum05/cmake-build-debug/rub2_praktikum05", "", NULL);
        }

            //child 2
        else if (pid == 0) {
            int bytes = read(fileDesc[0], &readString, BUFSIZE);
            close(fileDesc[0]); // not needed anymore
            pipe(fileDesc2);
            write(fileDesc2[1], &readString, bytes);
            close(fileDesc2[1]); // not needed anymore
        }
    }
    // Parent
    wait(NULL);
    dup2(fileDesc2[0], 0);
    close(fileDesc2[1]);
    close(fileDesc2[0]);
    int bytes = read(STDIN_FILENO, &readStringParent, BUFSIZE);
    write(STDOUT_FILENO, &readStringParent, bytes);
    return 0;
}