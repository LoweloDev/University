## Unix related
### iNode
iNodes are file-system objects stored in flat array on disk.

iNumber is the index of the respective node.

"i" stands for index

### Filestructure stat
Source: Linux Programmer Manual | struct_stat.h
```c
struct stat {
               dev_t     st_dev;         /* ID of device containing file */
               ino_t     st_ino;         /* Inode number */
               mode_t    st_mode;        /* File type and mode */
               nlink_t   st_nlink;       /* Number of hard links */
               uid_t     st_uid;         /* User ID of owner */
               gid_t     st_gid;         /* Group ID of owner */
               dev_t     st_rdev;        /* Device ID (if special file) */
               off_t     st_size;        /* Total size, in bytes */
               blksize_t st_blksize;     /* Block size for filesystem I/O */
               blkcnt_t  st_blocks;      /* Number of 512B blocks allocated */

               /* Since Linux 2.6, the kernel supports nanosecond
                  precision for the following timestamp fields.
                  For the details before Linux 2.6, see NOTES. */

               struct timespec st_atim;  /* Time of last access */
               struct timespec st_mtim;  /* Time of last modification */
               struct timespec st_ctim;  /* Time of last status change */

           #define st_atime st_atim.tv_sec      /* Backward compatibility */
           #define st_mtime st_mtim.tv_sec
           #define st_ctime st_ctim.tv_sec
           };
```

#### lstat()
https://linux.die.net/man/2/lstat

### stderr, stdout, stdin
```c
#include <stdio.h>

       extern FILE *stdin;
       extern FILE *stdout;
       extern FILE *stderr;
```
Under  normal circumstances every UNIX program has three streams opened
for it when it starts up, one for input, one for output,  and  one  for
printing diagnostic or error messages.

### st_mode and bitwise AND & S_IRUSR

```c
buf.st_mode & 0777
```
0777 is octal (Binary: 111111111)
It is Bitmask whichs usage is defined here:

https://man7.org/linux/man-pages/man7/inode.7.html

Following example operation happens where | is used as divider for better 
visualization as well as hypens prepending the bitmask:

```c
// Binary result of st_mode
1000000|110100100
// Bitmask for to get permission bits only
-------|111111111

// Operation 1&1 -> 1; 1&0 -> 0; 0&0 -> 0
1000000|110100100
&&&&&&&|&&&&&&&&&
-------|111111111

// Result
-------|110100100
```
#### S_IRUSR:
Read permission bit for the owner of the file. On many systems this bit is 0400.
example usage:

```c
// 0 -> false; 1 -> true
if (perm & S_IRUSR)
    
// Binary result of aboves bitmask
110100100
// return value of S_IRUSR
100000000

// Operation 1&1 -> 1; 1&0 -> 0; 0&0 -> 0
110100100
&&&&&&&&&
100000000

// Result
1
```

## General
### struct
Like class in Java or Object. Can contain list of attributes of multiple
types
e.g.:
```c
struct Books {
   char  title[50];
   char  author[50];
   char  subject[100];
   int   book_id;
};
```

### Pointers

& retrieves address (can be used e.g. if pointer is paramter of function)

\* points to address

e.g.: 
```c
return_type function_name( *pointerParameter) { ... };

function_name(&addressToPointAt);
```

### main function arguments

https://stackoverflow.com/questions/4176326/arguments-to-main-in-c

### Aufgabe 2.1
See dateiinfo.sh and dateiinfo.txt

To execute script:
```shell
bash dateiinfo.sh
```

### Aufgabe 2.2
Src: https://linux.die.net/man/2/lstat
stat() stats the file pointed to by path and fills in buf.
lstat() is identical to stat(), except that if path is a symbolic link, then the link itself is stat-ed, not the file that it refers to.

Antwort: Weil das Ziel Funktionalität wie bei dem bash command ls war,
was symlinks anzeigt, statt die Datei auf die mit dem symlink gezeigt wird.