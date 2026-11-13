#include<stdio.h>

void main() {   

    int d, m, a;
    
    printf("Digite a idade em dias meses e anos: ");
    scanf("%d %d %d", &d, &m, &a);

    int resposta = a*365 + m*30 + d;

    printf("Idade em dias: %d\n", resposta );
    
}