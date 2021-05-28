#include <stdio.h>

void quadrat(float*);

void quadrat(float *zahl){
    *zahl = (*zahl) * (*zahl);

    printf("%f", *zahl);
}

int main() {

    float seitenlaenge = 3.7;

    quadrat(&seitenlaenge);
    return 0;
}
