#include <stdio.h>

void multiplier(int n) {

    for(int i = 1; i <= 10; i++) {
        int result = n*i;
        printf("%i ", result);
    }
    printf("\n");
}

int main() {

    for(int i = 1; i <= 10; i++){
        multiplier(i);
    }

    return 0;
}
