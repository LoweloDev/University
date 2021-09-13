#include <stdio.h>
#include <unistd.h>
#include <string.h>
#include <ctype.h>

#define BUFSIZE 4096

int main() {
    char buffer[BUFSIZE] = {"\0"};
    while(read(STDIN_FILENO, &buffer, BUFSIZE) > 0) {
        for(int i = 0; i < sizeof buffer; i++) {
           buffer[i] = toupper(buffer[i]);
        }
    }

    // weitere option für null-termination vom String. Folgendes passiert String char[] = {"S","T","R","I","N","G","\n"}
    // \n replaced mit \0 indiziert end of string. \n kommt daher, dass man Enter drückt i.e. newline character
//    buffer[strlen(buffer) - 1] = '\0';
    write(STDOUT_FILENO, &buffer, strlen(buffer));

    return 0;
}
