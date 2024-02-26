
//Para compilar entre no terminal e digite: g++ -o p02 p02.cpp data.cpp produto.cpp

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "data.h"
#include "produto.h"


void main() {

	Produto p;
	
	p.nome = (char*) malloc(sizeof(char));
	strcpy(p.nome, "CHOCOLATE");

	p.valor = 5.00f;

	p.fabricacao.dia = 26;
	p.fabricacao.mes = 1;
	p.fabricacao.ano = 2017;

	imprimeProduto(p);

	printf("\n\n");

}