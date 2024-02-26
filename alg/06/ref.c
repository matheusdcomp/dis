#include<stdio.h>

int fatorial (int *x) {
    int fat = 1;
    for (; *x > 1; (*x)--)
        fat *= *x;
    return fat;
}

void main() {

    //int n = 5;
    int f = fatorial(5);
    printf("Fatorial de %d: %d", 5, f);

}