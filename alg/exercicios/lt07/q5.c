/*
Crie uma função que recebe uma string str e um inteiro x 
e retorna uma string sem os x primeiros caracteres de str. 
Crie um programa que solicta uma string e um inteiro do 
usuário e imprime a string resultante do uso da função criada.
*/

#include<stdio.h>
#include<string.h>
#define TAM 100


char* strcut(char str[], int x) {
	static char sub[TAM];
	int p = 0;
	for (int i = x; str[i] != '\0'; i++ )
		sub[p++] = str[i];
	sub[p] = '\0';
	return sub;
}

char* strcut2(char str[], int x) {
	return &str[x];
}

int main() {
	int x;
	char str[TAM];

	printf("Digite uma string: ");
	gets(str);
	printf("Digite um inteiro menor que o tamanho da string: ");
	scanf("%d", &x);
	printf("\"%s\" sem os %d primeiros elementos: \"%s\"\n",
		str, x, strcut(str, x));
	printf("\"%s\" sem os %d primeiros elementos: \"%s\"\n",
		str, x, strcut2(str, x));
		
}