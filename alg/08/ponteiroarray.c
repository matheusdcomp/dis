#include <stdio.h>

void main() {
	int *p = (int*) malloc(sizeof(int));
	*(p+0) = 10;
	*(p+1) = 20;
	*(p+2) = 30;
	printf("\n %d %d %d \n", p[0], p[1], p[2] );
}