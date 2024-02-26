#include <stdio.h>

void main() {
	int x = 10, *p = &x;
	int **pp = &p;
	printf("\nValor de pp (endereco de p): %x", pp);
	printf("\nValor de p  (endereco de x): %x", *pp);
	printf("\nValor de x:                  %d", **pp);

}