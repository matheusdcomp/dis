/*
Crie um registro Carro com nome e valor. 
Crie um programa que cadastra 5 carros em um array 
com dados do usuário e no final imprime o mais
caro. O acesso a cada elemento do array deve sempre 
ser feito por meio de um ponteiro.
*/

#include<stdio.h>

typedef struct {
    char nome[50];
    float valor;
} carro;

void main() {
    carro cs[5], *pca, *pmc = cs;
    for (int i = 0; i < 5; i++) {
        
        pca = cs + i;
        
        printf("\nDigite o nome do %do carro:\t", i+1);
        scanf(" %s", pca->nome);
        printf("Digite o valor do %do carro:\t", i+1); 
        scanf("%f", &pca->valor);
        
        if (pca->valor > pmc->valor) pmc = pca;
    }

    printf("\n\nCarro mais caro:\nNome:\t%s\nValor:\t%.f\n", 
        pmc->nome, pmc->valor);
}