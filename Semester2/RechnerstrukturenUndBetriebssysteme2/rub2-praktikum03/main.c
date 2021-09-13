#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Aufgabe 3.3, 3.4

#define MAXLINE 4096
 /* max line length */

 void sigtermHandler() {
     printf("nope");
 }

 void sigintHandler() {
     printf("nope");
 }

 int main(void) {
     char buf[MAXLINE];
     pid_t pid;
     int
     status;

     printf("%% "); /* print prompt (printf requires %% to print %) */

     signal(SIGTERM, sigtermHandler);
     signal(SIGINT, sigintHandler);

     while (fgets(buf, MAXLINE, stdin) != NULL) {
         buf[strlen(buf) - 1] = 0;
         /* replace newline with null */

         if ( (pid = fork()) < 0)
             perror("fork error");
         else if (pid == 0) {

             if(buf[0] == 'q') {
                 kill(pid, SIGKILL);
             }

             execlp(buf, buf, (char *) 0);
             printf("couldn't execute: %s\n", buf);
             exit(127);
         }

         if ( (pid = waitpid(pid, &status, 0)) < 0)
             perror("waitpid error");
         printf("%% ");
     }
     exit(0);
 }

