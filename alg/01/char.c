#include<stdio.h>

void main() {
	char caractere;
	printf("\nDigite um caractere: ");
	scanf("%c", &caractere);
    printf("\nO codico ASCII de %c eh: %d\n", caractere, caractere);
    /*
    Todo caractere possui um código que é um número inteiro.
    Na linguagem C, esse código segue o padrão American 
    Standard Code for Information Interchange (ASCII),
    que possui 127 caracteres. Por exemplo, o código do 
    caractere 'A' (A maiúsculo) é 65 e o do 'a' (a minúsculo)
    é 97. Já o digito '0' possui o código 48.
    */
}
