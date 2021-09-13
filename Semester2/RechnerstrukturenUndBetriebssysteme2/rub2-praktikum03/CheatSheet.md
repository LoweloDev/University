### Aufgabe 3.1

```c
void handler() {
    printf("killed");
}

int main() {

    signal(SIGTERM, handler);

    sleep(3);

    kill(getpid(), SIGTERM);
    return 0;
}
```

### Aufgabe 3.2
The commands can be send as follows via CLI:
- ctrl+c (if in respective window where process executed) or kill -2 processID for SIGINT
- kill -15 processID for SIGTERM

```c
 void sigtermHandler() {
    printf("handled");
}

void sigintHandler() {
    printf("handled");
}
 int main(void) {
    printf("%d", getpid());
    signal(SIGTERM, sigtermHandler);
    signal(SIGINT, sigintHandler);

    for ( ; ; ) {
        pause();

        puts("main: Signal empfangen");

    }

}
```
https://www.cyberciti.biz/faq/unix-kill-command-examples/

### Aufgabe 3.3 3.4
See main.c

Either compare with strcmp()
or buf[0] == 'q'.

### fgets()
Important note: since it stops in this case when newline character is read (i.e. when you press enter and thus enter newline character)
it is necessary to remove that newline character to actually compare.

It also null-terminates a string. Which is necessary because if broken down to assembler
language, the string is read from stack and computer doesn't know where end of string is otherwise.
The 0 at the end of string indicates said end of string and thus terminates this reading process.