#include <stdio.h>
#include <stdlib.h>
#include "./ggt.h"

int main (int argc, char *argv[]) {
    int x = 9;
    int y = 21;
    
    printf("ggt(%d, %d) = %d", x, y, ggt(x, y));
    
   return EXIT_SUCCESS;
}