#include <sys/wait.h>
#include <unistd.h>
#include <string.h>

// Aufgabe 4.3 und 4.2

// fork-exec design pattern, see cheatsheet

int main(int argc, char *argv[]) {
    int fileDesc[2], fileDesc2[2];
    // reminder: string = chararray
    int stringLength = strlen(argv[1]);
    char readString[stringLength], readStringParent[stringLength];

    pipe(fileDesc);
    pipe(fileDesc2);
    pid_t pid = fork();

    // parent
    if (pid > 0) {
        close(fileDesc[0]);
        // for whatever reason you cant take & to retrieve address of argv[1] here
        write(fileDesc[1], argv[1], stringLength);
        wait(NULL);
        int bytes = read(fileDesc2[0], &readStringParent, stringLength);
        close(fileDesc2[0]);
        write(STDOUT_FILENO, &readStringParent, bytes);
    }

    //child
    else if (pid == 0) {
        close(fileDesc[1]);
        int bytes = read(fileDesc[0], &readString, stringLength);
        close(fileDesc[0]); // not needed anymore
        write(fileDesc2[1], &readString, bytes);
        close(fileDesc2[1]); // not needed anymore
    }
    return 0;
}
