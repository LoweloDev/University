#include <unistd.h>
#include <string.h>
#include <fcntl.h>
#include <wait.h>

int main() {
    int fd[2];
    pipe(fd);
    pid_t pid = fork();
    if (pid == 0) {
        fd[0] = open("/home/lowelodev/IdeaProjects/University/Semester2/RechnerstrukturenUndBetriebssysteme2/rub2-uebung04-vorlesung04/a", O_RDONLY);
        dup2(fd[0], STDIN_FILENO);
        close(fd[0]);
        execlp("cat","cat", NULL);
    }
    fd[1] = open("/home/lowelodev/IdeaProjects/University/Semester2/RechnerstrukturenUndBetriebssysteme2/rub2-uebung04-vorlesung04/b", O_WRONLY);
    dup2(fd[1], STDOUT_FILENO);
    close(fd[1]);
    execlp("wc", "wc", NULL);

    return 0;
}
