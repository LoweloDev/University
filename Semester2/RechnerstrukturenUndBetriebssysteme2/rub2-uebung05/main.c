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
            dup2(fd[1], 1);
            close(fd[1]);
            execlp("ls", "ls", "-l", "/etc", NULL);
        }

        // stuff coming from being put into pipeline redirected into actual STDIN
        dup2(fd[0], 0);
        close(fd[1]);
        close(fd[0]);

        /* Useless block. Creates empty file that doesn't contain anything.*/
        fdf = open("x", O_WRONLY | O_CREAT, 0600);
        close(fdf);
        /* end of useless block*/

        // now since input of this parent is what came out of pipe (ls -l /etc) due to redirection above, we can create file on output.
        fdf = open("y", O_WRONLY | O_CREAT, 0600);
        dup2(fdf, 1);
        close(fdf);
        // results written to STDOUT which is file, as seen above.
        execlp("wc", "wc", "-l", NULL);
    }
    wait(NULL);
}