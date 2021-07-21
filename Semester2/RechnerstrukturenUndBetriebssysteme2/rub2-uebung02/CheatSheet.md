### Fork
```c
    printf("Hello %d %d \n", fork(), getpid());
```
- fork() clones calling process. 2^n Processes where n is number of fork();
- thus number of CHILD processes is 2^n-1

### Process ID (PID)

 - The child has its own unique process ID, and this PID does not match 
   the ID of any existing process group (PGID) (Method reference: setpgid(2)) 
   or session (SID / sessionid).
   

- in unix PID is sequentially assigned from 0 to MAX_VALUE,
thus PID of child process depends on how many processes run before this one.

### Inconsistent forking cancer
```c
// 3. Clone: Parent: 2. Clone (in this case 392696)
ppid 392696, processID 392698, pid1 0, pid 2 392696, pid3 0
1 2 0
// 2. clone: Parent: Root (in this case 392693)
ppid 392693, processID 392696, pid1 0, pid 2 392696, pid3 392698
0 2 0
// 1. clone: Parent: Root (in this case 392693)
ppid 392693, processID 392697, pid1 392696, pid 2 392693, pid3 0
1 1 1
// root
ppid 352995, processID 392693, pid1 392696, pid 2 392693, pid3 392697
0 2 1
```
### Flowchart of main.c

![image](https://i.ibb.co/dtwR0p7/image.png)