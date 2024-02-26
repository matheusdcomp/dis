#include <stdio.h>

void main() {
	int *pvet[2];
	int x = 10, y[2] = {20,30};

	pvet[0] = &x;
	pvet[1] = y;
	printf("\npvet[0]: %x", pvet[0]);
	printf("\nValor de pvet[0]: %d", *pvet[0]);
	printf("\npvet[1]: %x", pvet[1]);
	printf("\nValor de pvet[1][0]: %d", pvet[1][0]);
	printf("\nValor de pvet[1][1]: %d", pvet[1][1]);

}