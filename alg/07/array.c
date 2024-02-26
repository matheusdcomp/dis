#include <stdio.h>

void main() {
	int a[3];
	
	printf("Endereco inicial: %x", a);

	*(a+0) = 10;
	*(a+1) = 20;
	*(a+2) = 30;
	
	for (int i = 0; i < 3; i++)
  		printf("\n%d", *(a+i));

}