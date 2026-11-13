/*
Crie uma função recursiva que recebe um inteiro e 
informa se ele é primo ou não (1 se for e 0 se não 
for primo). Crie um programa que solicita
um inteiro do usuário e informa se ele é primo ou não 
usando a função anterior.
*/

#include<stdio.h>

int primo(int);
int primoAux(int,int);
void main();

int primo(int x) {
    return primoAux(x,2);
}
int primoAux(int x, int d) {
    if (d > x/2) return 1;
    if (x % d == 0) return 0;
    return primoAux(x,d+1);
}

void main() {
    int a;
    printf("Digite um inteiro: ");
    scanf("%d", &a);
    printf("%d eh primo? %s\n", a, primo(a)?"sim":"nao");
}