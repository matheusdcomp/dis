//Fazer um programa que solicita um inteiro positivo e
//armazena todos os divisores dele em um array.
//No final, imprime o conteúdo do array.


#include<stdio.h>

void main() {
	int n, i = 0;
	printf("Digite um inteiro positivo: ");
	scanf("%d", &n);
	int t = n/2+1;
	int divisores[t];

	for (int d = 1; d < t; d++) {
		if (n % d == 0) {
			divisores[i] = d;
			i = i + 1;	
		}
	}

	for( int j = 0; j < i; j++ )
		printf("%d ", divisores[j]);
}

