#include<stdio.h>

void main() {   

    int n;
    
    printf("Digite um inteiro: ");
    scanf("%d", &n);

    int r = n * (n+1) / 2;

    printf("Resposta: %d\n", r );
    
}