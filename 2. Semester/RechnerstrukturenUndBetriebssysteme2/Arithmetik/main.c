#include <stdio.h>
#include <stdlib.h>

 int quersumme(int zahl)
 {
    int sum;
    while (zahl > 0) {
        sum = sum + zahl % 10;
        zahl = zahl/10;
    }

    return sum;
 }

 int main()
 {
 int x = 0;

 printf("Geben Sie ein Zahl ein: ");
 scanf("%d", &x);

 printf("Quersumme von %d: %d\n", x, quersumme(x));

 return EXIT_SUCCESS;
 }