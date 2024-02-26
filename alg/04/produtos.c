/*
Criar um programa que simula uma compra, na qual o usuário informa o nome, 
o valor e quantidade de diversos produtos até ele digitar um produto sem nome. 
Após isso, o programa imprime a nota fiscal.
*/

#include<stdio.h>
#include<stdlib.h>//para system(), função que permite usar um comando do sistema operacional.
#define TAM 50

int main() {

	char nome[TAM][TAM];
	float valor[TAM];
	int qtd[TAM];
	int i = 0;

	while(1) {
		printf("\nDigite o nome do produto: ");
		gets(nome[i]);
		if (nome[i][0] == '\0') break;
		printf("Digite o valor do produto: ");
		scanf("%f",&valor[i]);
		printf("Digite a quantidade comprada: ");
		scanf("%d",&qtd[i]);
		i++;
		fflush(stdin);
	}

	system("cls");//cls é um comando do windows que limpa a tela	
	printf("-----------------------------------------------------");
	for( int j = 0; j < i; j++ ) {
		printf("\n %-30s %6.2f x %3d = %6.2f", nome[j], valor[j], qtd[j], valor[j] * qtd[j]);
	}
	printf("\n-----------------------------------------------------\n\n");

}