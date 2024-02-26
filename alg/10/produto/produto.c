#include <stdio.h>
#include "produto.h" 

void imprimeProduto(Produto x) {
	printf("\nNome: %s\nValor: %.2f\nData de Fabricacao: ", x.nome, x.valor);
	imprimeData(x.fabricacao);
}
