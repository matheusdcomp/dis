#include<stdio.h>
#define TAM 5


int soma(int v[], int t) {
	int s = 0;
	for (int i = 0; i < t; i++)
		s += v[i];
	return s;
}

int possui(char str[], char c) {
	for (int i = 0; str[i] != '\0'; i++)
		if (str[i] == c)
			return 1;
	return 0;	
}

void main() {
	int a[TAM] = {1,2,3,4,5};
	int sm = soma(a, TAM);
	printf("\nSoma dos elementos de a: %d\n", sm); 
	char nome[] = "JOAO";
	if (possui(nome, 'A'))
		printf("\nJOAO POSSUI A LETRA 'A'\n");
}



