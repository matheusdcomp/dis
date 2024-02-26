#include <stdio.h>

void main() {

	float *x, *y = NULL;
	printf("\n  X = %x, Y = %x\n", x, y); 

	float a = 5, *p1 = &a;
	float b = 10, *p2 = &b;
	float k = *p1 * *p2;

	printf("\nValor de a: %f", a);
	printf("\nEndereco de a: %x\n", &a);

	printf("\nValor de p: %x", p1);
	printf("\nEndereco de p: %x\n", &p1);
	printf("\nValor da variavel apontada por p: %f\n", *p1);
}