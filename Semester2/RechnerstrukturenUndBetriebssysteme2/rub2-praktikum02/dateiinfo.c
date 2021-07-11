#include <stdio.h>
#include <sys/types.h> 
#include <sys/stat.h>
#include <libgen.h>
#include <pwd.h>
#include <grp.h>

int main(int argc, char** argv) 
{
  int fileinfo;

  // buffer for stat structure, see CheatSheet.md
  struct stat buf;

  // iterate over main function arguments, see CheatSheet.md
  for (int i = 1; i < argc; i++) {

    fileinfo = lstat(argv[i], &buf);

    // print to stderr Stream on error, see CheatSheet
    if (fileinfo < 0) {
      fprintf(stderr, "Fehler in lstat\n");
      continue;
    } 

    // Bitshifting to get filetype bits as defined in linux manual, See CheatSheet st_mode

    mode_t typ = buf.st_mode >> 12;
    switch (typ) { 
      case 010: printf("-"); break; // regular file
      case 004: printf("d"); break;
      case 002: printf("Zeichen-Geraetedatei, "); break; 
      case 006: printf("Block-Geraetedatei, "); break; 
      case 001: printf("FIFO, "); break; 
      case 012: printf("l"); break; 
      case 014: printf("Socket, "); break;
      default:  printf("unbekannter Typ,");
    }

    // bitmasking to get permission bits as defined in linux manual, See CheatSheet
    mode_t perm = buf.st_mode & 0777;

    // checks if user is permitted to read file
    if (perm & S_IRUSR)
        printf("r");
    else
        printf("-");

    // Aufgabe 2.3 & 2.4 Sidenote: Filesize of directory doesn't contain filesize of contents
    printf(" %dB %s %s %s \n", buf.st_size, getpwuid(buf.st_uid) -> pw_name, getgrgid(buf.st_gid) -> gr_name, basename(argv[i]));
  }

  return 0;
}