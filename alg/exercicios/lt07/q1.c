/*
Crie uma função que recebe um inteiro N e um caractere e 
imprime esse caractere N vezes. Crie um programa que solicita 
o inteiro e o caractere, utilize a função e imprima o resultado.
*/

#include<stdio.h>

void imprime(int n, char c) {
	for (int j = 0; j < n; j++)
		printf("%c", c);
}

void main() {
	int n;
	char c;
	printf("Digite um inteiro e um char: ");
	scanf("%d %c", &n, &c);
	imprime(n,c);		
}