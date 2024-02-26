//Fazer um programa que solicita 10 inteiros. 
//e depos imprime cada um em uma linha
//com o maior destacado com uma tabulação.

#include<stdio.h>

void main() {

	const int TAM = 10;	
	int iDoMaior=0, X[TAM];

	for (int i = 0; i < TAM; i++) {
		printf("Digite o %do inteiro: ", i+1);
		scanf("%d", &X[i]);
		if (X[i] > X[iDoMaior])
			iDoMaior = i;
	}

	printf("\n\nNumeros digitados:\n");
	for (int i = 0; i < TAM; i++) {
		if (i == iDoMaior)
			printf("\t");
		printf("%d\n", X[i]);
	}

}