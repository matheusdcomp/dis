#include<stdio.h>

void troca(int *a, int *b) {
	int aux = *a;
	*a = *b;
	*b = aux;	

}

int soma (int a, int b) {
	a++;
	return a + b;
}

void main() {
	int x = 1;
	int y = 2;
	printf("%d + %d = %d", x, y, soma(x,y) );
	troca(&x,&y);
	printf("X = %d, Y = %d", x, y); 
}



