///////////////////////////////////////////////////////////////////////////////////
// Arquivo biblioteca
// #ifndef, #define e #endif servem para impedir que,
// caso este arquivo de biblioteca seja incluído em um programa mais de uma vez,
// haja uma duplicidade de suas definições. 
///////////////////////////////////////////////////////////////////////////////////


#ifndef PRODUTO_H 
#define PRODUTO_H

#include "data.h"

typedef struct {
	char* nome;	
	float valor;
	Data fabricacao;
} Produto;

void imprimeProduto(Produto);


#endif
