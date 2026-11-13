/*
Crie uma função que recursiva que recebe uma string e a 
inverte. Crie o programa que solicita uma string, utiliza 
a função criada e a imprime invertida.
*/

#include<stdio.h>
#include<string.h>

void inverte(char[]);
void inverteAux(char[], int, int);
void main();

void inverte(char str[]) {
    inverteAux(str, 0, strlen(str)-1);
}
void inverteAux(char str[], int i, int f) {
    if (i >= f) return;
    char aux = str[i];
    str[i] = str[f];
    str[f] = aux;
    inverteAux(str, i+1, f-1);
}

void main() {
    char s[50];
    printf("Digite uma string: ");
    gets(s);
    inverte(s);
    printf("Inverso: %s\n", s);
}