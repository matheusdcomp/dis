//Fazer um programa que solicita 5 números e os armazena em um array.
//Em seguida, ele solicita um número x e imprime cada elemento do array 
//multiplicado pelo x.

#include<stdio.h>

void main() {

	const int TAM = 5;	
	int m, X[TAM];

	for (int i = 0; i < TAM; i++) {
		printf("Digite o %do inteiro: ", i+1);
		scanf("%d", &X[i]);
	}

	printf("Digite o inteiro multiplicador: ");
	scanf("%d", &m);

	printf("\nElementos do array multiplicados por %d: ", m);
	for (int i = 0; i < TAM; i++)
		printf("%d ", X[i]*m);

}