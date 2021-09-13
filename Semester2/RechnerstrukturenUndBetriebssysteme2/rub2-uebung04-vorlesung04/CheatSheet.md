### Aufgabe 1

0 STDIN
2 STDERR
3 STDOUT
5 STDOUT

Steps:
- STDOUT duplicated lowest available no. 3
- 1 closed - number available
- 3 duplicated to new fd 5
- 5 duplicated to lowest available no. 1
- fd (now 1) closed - 1 available again

### Aufgabe 2
dup2 replacing filedescriptor with respective file.

```c
    int a = open("/home/lowelodev/IdeaProjects/University/Semester2/RechnerstrukturenUndBetriebssysteme2/rub2-uebung04-vorlesung04/a", O_RDONLY);
    dup2(a, STDIN_FILENO);
    close(a);

    a = open("/home/lowelodev/IdeaProjects/University/Semester2/RechnerstrukturenUndBetriebssysteme2/rub2-uebung04-vorlesung04/b", O_WRONLY);
    dup2(a, STDOUT_FILENO);
    close(a);
    execlp("cat","cat", NULL);

    return 0;
```

### Aufgabe 3
cat /etc/passwd | wc -l

### Aufgabe 4



