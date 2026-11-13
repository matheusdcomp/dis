/*
Implemente um programa que calcula a soma dos elementos 
de um array de ponteiros para float de tamanho 5. Os 
valores do array devem ser preenchidos pelo usuário.
*/

#include<stdio.h>

void main() {
    float s = 0, *pf[5], f[5];
    for (int i = 0; i < 5; i++) {
        printf("Digite o %d numero: ", i+1);
        pf[i] = f+i;//equivalente a &f[i] ou &f[0] + i
        scanf("%f", pf[i]);
        s += *pf[i];
    }
    
    for (int i = 0; i < 5; i++) 
        printf(" %.2f ", *pf[i]);

    printf("\nSoma: %.2f\n", s);
}

