#include<stdio.h>

void main() {
	int n, s = 0;

	for ( ; ; ) {//equivale a for (;1;) ou while(1)
		printf("Digite um inteiro positivo ou 0 para sair: ");
	  scanf("%d", &n);
    if (n == 0) break;
    s += n;
	}
	printf("\nSoma dos numeros digitados: %d\n", s);
	
}