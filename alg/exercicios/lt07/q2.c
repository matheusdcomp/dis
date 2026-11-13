/*
Crie uma função que recebe duas matrizes 3x3 e calcula a multiplicação delas. 
Crie um programa que solicita os números de duas matrizes 3x3, utiliza a função 
criada e imprime a matriz resultante.
*/

#include<stdio.h>
#define TAM 3

void multiplica(int m[][TAM], int a[][TAM], int b[][TAM]) {
	for (int i = 0; i < TAM; i++){
		for (int j = 0; j < TAM; j++)
			m[i][j] = a[i][0]*b[0][j] + a[i][1]*b[1][j] + a[i][2]*b[2][j];
	}
}

void main() {

	int a[TAM][TAM], b[TAM][TAM], m[TAM][TAM];

	printf("\nMatriz A:\n");
	for (int i = 0; i < TAM; i++){
		for (int j = 0; j < TAM; j++){
			printf("Digite o elemento [%d][%d]: ", i, j);
			scanf("%d",&a[i][j]);
		}
	}

	printf("\nMatriz B:\n");
	for (int i = 0; i < TAM; i++){
		for (int j = 0; j < TAM; j++){
			printf("Digite o elemento [%d][%d]: ", i, j);
			scanf("%d",&b[i][j]);
		}
	}

	multiplica(m,a,b);

	printf("\n\n");
	for (int i = 0; i < TAM; i++){

		for (int j = 0; j < TAM; j++)
			printf("%3d ", a[i][j]);

		printf("%s",(i == TAM/2 ? "   x    " : "        "));
	
		for (int j = 0; j < TAM; j++)
			printf("%3d ", b[i][j]);

		printf("%s",(i == TAM/2 ? "   =    " : "        "));
	
		for (int j = 0; j < TAM; j++)
			printf("%3d  ", m[i][j]);
		
		printf("\n");
	}
		
}