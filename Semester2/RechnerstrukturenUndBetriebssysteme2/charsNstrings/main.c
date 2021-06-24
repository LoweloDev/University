#include <stdio.h>
#include <stdlib.h>
#include <string.h>

 // HOW TO GET ASCII VALUE OF CHAR: CAST CHAR AS INT!

 int ascii2int(char *s)
 {
 int zahl = 0;
 int i = 0;
    while(s[i] - '0' >= 0 && s[i] - '0' <= 9) {
        zahl = (zahl * 10) + (s[i] - '0');
        i++;
    }
 // hier fehlt was
 return zahl;
 }

 int main()
 {
 char *zahl[] = {"53463",
                 "44227 Dortmund",
                 "01234"
 };

 for (int i = 0; i < sizeof(zahl) / sizeof(char *); i++)
 {
 printf("Der String '%s' ist als Integer darstellt '%d'\n",
 zahl[i], ascii2int(zahl[i]));
 }

 return EXIT_SUCCESS;
 }
