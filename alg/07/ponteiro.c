#include<stdio.h>

void main() {

	int a = 5;
	int *p = &a;

	printf("\nValor de a: %d", a);
	printf("\nEndereco de a: %x \n", &a);

	printf("\nValor de p (endereco da variavel apontada): %x", p);
	printf("\nValor da variavel para a qual p aponta: %d", *p);
	printf("\nEndereco de p: %x \n", &p);

}