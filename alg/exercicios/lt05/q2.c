//Digite 10 números em um vetor e no final imprima a média,
//o maior e o menor número.

#include<stdio.h>

void main() {

    float x[10], media, menor, maior; 

    for (int i = 0; i < 10; i++) {
        printf("Digite o %do elemento: ", i+1);
        scanf("%f", &x[i]);
        media += x[i];
        if (i == 0) 
            menor = maior = x[i];
        else  {
            if (x[i] < menor) menor = x[i];
            if (x[i] > maior) maior = x[i];
        }      
    }

    printf("\nMedia: %f\nMenor: %f\nMaior: %f\n", 
        media/10, menor, maior);
    
}