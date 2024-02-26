#include<stdio.h>

void main() {
	printf("Digite os lados do retangulo: ");
	float l1, l2, area;
	scanf("%f %f", &l1, &l2);
	area = l1 * l2;
	printf( "A area do retangulo eh: %f", area );
}
