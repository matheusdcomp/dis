#include<stdio.h>
#define LIN 3
#define COL 3

void main() {

	int g[LIN][COL], sl[LIN], sc[COL];

	for (int linha = 0; linha < LIN; linha++) {
		for (int coluna = 0; coluna < COL; coluna++) {
			printf("Digite o elemento [%d][%d]: ", linha, coluna);
			scanf("%d", &g[linha][coluna]);
		}
	}

	printf( "\nSoma de cada linha: ");
	for (int linha = 0; linha < LIN; linha++) {

		sl[linha] = 0;

		for (int coluna = 0; coluna < COL; coluna++)
			sl[linha] += g[linha][coluna];

		printf( "%d ", sl[linha]);
	}
	
	printf( "\nSoma de cada coluna: ");
	for (int coluna = 0; coluna < COL; coluna++) {

		sc[coluna] = 0;

		for (int linha = 0; linha < LIN; linha++)
			sc[coluna] += g[linha][coluna];

		printf( "%d ", sc[coluna]);
	}		

	printf( "\n" );

}