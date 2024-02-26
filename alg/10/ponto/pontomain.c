
#include <stdio.h>
#include "ponto.h"


int main() {

	Ponto p1, p2;		
	int qtd_prod = 0;
	printf("Digite as coordenadas x e y de um ponto: ");
	scanf("%lf %lf", &(p1.x), &(p1.y));
	printf("Digite as coordenadas x e y de outro ponto: ");
	scanf("%lf %lf", &(p2.x), &(p2.y));

	Ponto sm = soma(p1,p2);
	Ponto sb = sub(p1,p2);

	printf("\nA soma dos dois pontos eh o ponto (%.1f,%.1f).", sm.x, sm.y);
	printf("\nA subtracao dos dois pontos eh o ponto (%.1f,%.1f).\n\n", sb.x, sb.y);
	
	return 0;
}