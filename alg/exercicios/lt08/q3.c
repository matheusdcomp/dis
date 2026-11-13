/*
Crie uma função recursiva que recebe uma string e 
retorna o seu tamanho.
Crie uma função recursiva que recebe uma string e 
um caractere e retorna 1 caso ele exista na string ou 0, 
caso contrário. Crie um programa que
solicite uma string e um caractere e utilize as duas funções.
*/

#include<stdio.h>

int tamanho(char[]);
int contem(char[],char);
void main();

int tamanho(char str[]) {
    if (str[0] == '\0') return 0;
    return 1 + tamanho(&str[1]);
}

int contem(char str[], char c) {
    if (str[0] == '\0') return 0;
    if (str[0] == c) return 1;
    return contem(&str[1],c);
}

void main() {
    char s[50], c;
    printf("Digite uma string: ");
    gets(s);
    printf("Digite um caractere: ");
    scanf(" %c", &c);
    printf("Tamanho de %s: %d\n", s, tamanho(s));
    printf("%s contem %c? %s\n", s, c, contem(s,c)?"sim":"nao");
}