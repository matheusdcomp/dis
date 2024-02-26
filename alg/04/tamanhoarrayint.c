#include<stdio.h>

void main() {
	int vetor[] = {0,1,2,3,4,5,6,7};
	int t = sizeof(vetor)/sizeof(vetor[0]);
	printf("\n%d\n", t);
}