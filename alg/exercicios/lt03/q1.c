#include<stdio.h>

void main() {

    int ano;
    printf("Digite um ano: ");
    scanf("%d", &ano);

    if ( ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0) ) 
        printf("\n%d eh bissexto.\n", ano);
    else
        printf("\n%d nao eh bissexto.\n", ano);

}