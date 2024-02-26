#include <stdlib.h>
#include <string.h>
#include <stdio.h>

typedef struct {
	int rg;
	char* nome;
} Pessoa;
 
void main() {

	Pessoa *p = (Pessoa*) malloc(sizeof (Pessoa));
   	p->rg = 123;
   	p->nome = (char*) malloc(sizeof(char));
   	strcpy(p->nome, "JOAO");
	
	printf("\nValor do ponteiro: %x", p) ;
	printf("\nRG da pessoa apontada: %d", p->rg);
	printf("\nNome de pessoa apontada: %s", p->nome); 

	printf("\nRG da pessoa apontada: %d", p->rg);
	printf("\nNome da pessoa apontada: %s", p->nome);

	printf("\n\nDigite o RG: ");
	scanf("%d", &p->rg );
	printf("Digite o nome: ");
	scanf("%s", p->nome );

	printf("\n\nValor do ponteiro: %x", p);
	printf("\nRG da pessoa apontada: %d", p->rg);
	printf("\nNome de pessoa apontada: %s", p->nome); 
}
