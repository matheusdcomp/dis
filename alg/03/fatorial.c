#include<stdio.h>

void main() {
    int n, f = 1;
    printf("Digite um inteiro positivo: ");
    scanf("%d", &n);
    int fat = n;
    while (fat > 1)
    f *= fat--;
    printf("O fatorial de %d eh %d\n", n, f);
}
