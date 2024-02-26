//Fazer um programa que solicita 10 inteiros, 
//e depois imprime todos os positivos em uma 
//linha e todos os que são negativos em outra.

#include<stdio.h>

void main() {

	const int TAM = 10;	
	int X[TAM];

	for (int i = 0; i < TAM; i++) {
		printf("Digite o %do inteiro: ", i+1);
		scanf("%d", &X[i]);
	}

	printf("\nElementos positivos e zero: ");
	for (int i = 0; i < TAM; i++)
		if (X[i] >= 0)
			printf("%d ", X[i]);

	printf("\nElementos negativos: ");
	for (int i = 0; i < TAM; i++)
		if (X[i] < 0)
			printf("%d ", X[i]);

}