#include<stdio.h>

void main() {
	int a = 1;
	float b = 2.5; 
	char c = 'H';
	printf("\nComo imprimir um inteiro: %d\n", a);
	printf("\nComo imprimir um float: %f ou  %.2f\n", b, b);//%.2f siginifca 2 digitos após o ponto
	printf("\nComo imprimir um caractere: %c\n", c);
	printf("\nComo imprimir um texto: %s\n", "Linguagem de programacao");
	printf("\n%s %s%s\n",
    "Fazendo isso,", 
    "voce divide o printf ",
    "em varias linhas");
}
