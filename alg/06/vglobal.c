#include<stdio.h>

#define TAM 10
int vetor[TAM];

void preencheVetor() {
    for (int i = 0; i < TAM; i++) {
        printf("Digite o %do elemento do array: ", i+1);
        scanf("%d", &vetor[i]);    
    }
}

void main() {
    preencheVetor();
    for (int i = 0; i < TAM; i++) {
        printf("\n%do elemento do array: %d", i+1, vetor[i]);    
    }
}