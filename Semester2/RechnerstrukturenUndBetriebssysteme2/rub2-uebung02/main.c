#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>

int main() {
    // fork() clones calling process. 2^n Processes where n is number of fork();
    // thus number of CHILD processes is 2^n-1
    //    printf("Hello %d %d \n", fork(), getpid());

        int v1 = 0, v2 = 0, v3 = 0, pid1, pid2, pid3;
        pid1 = fork();
        pid2 = getpid();
        v2++;
        pid3 = fork();

        if (pid1 == pid3) {
            v1++;
            v2++;
        } else if (pid2 == getppid()) {
            v1++;
            v3++;
            sleep(1);
        } else if (pid2 == getpid()) {
            v2++;
            wait(NULL);
            if (pid1 > 0) {
                v3++;
                wait(NULL);
            }
        }
        /* Testing */
        printf("ppid %d, processID %d, pid1 %d, pid 2 %d, pid3 %d\n", getppid(), getpid(), pid1, pid2, pid3);
        /* end */
        printf("%d %d %d\n", v1, v2, v3);
    return 0;
}
