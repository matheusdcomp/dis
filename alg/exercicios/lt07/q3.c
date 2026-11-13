/*
Crie uma função que recebe uma string e um caractere e 
retorna a posição do caractere se ele existir na string, ou 
-1 caso ele não exista na string. Crie uma função que recebe 
duas strings e retorna 1 se a primeira for uma substring da 
segunda ou 0, caso contrário. Utilize a primeira função para 
implementar a segunda. Crie um programa que solicite duas 
strings e verifica se a primeira é uma substring da segunda.
*/


#include<stdio.h>
#include<string.h>
#define TAM 100


int indexOf(char str[], char c) {
	for (int i = 0; str[i] != '\0'; i++)
		if (str[i] == c)
			return i;
	return -1;
}

int isSubstring(char sub[], char str[]) {
		
	int encontrou;
	int p = indexOf(str, sub[0]);//onde aparece o 1o char de sub em str 
	int n = p; //a partir de qual índice deve procurar sun em str
		
	while( p > -1 ) {			
		encontrou = 1;		
		for(int i = 0; i < strlen(sub); i++ ) {
			if (str[n+i] != sub[i]) {
				encontrou = 0;
				break;
			}
		}
		if (encontrou) return 1;
		p = indexOf(&str[++n], sub[0]);
		n += p; 
	}
	return 0;
}

void main() {
	char str[TAM], sub[TAM];
	printf("Digite uma string: ");
	gets(str);	
	printf("Digite outra string: ");
	gets(sub);
	printf("\n\"%s\"%s eh substring de \"%s\".\n", 
		sub, isSubstring(sub,str)? "" : " nao", str);
}