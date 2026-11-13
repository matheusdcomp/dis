/*
Implemente a função Fibonacci utilizando passagem por 
referência e crie um programa que utiliza a função a 
partir de um valor digitado pelo usuário.
*/

#include<stdio.h>

//normal
int fib(int *n) {
    int s = 0, p = 0, pp = 1;
    for (int i = 2; i <= *n; i++) {
        s = p + pp;
        p = pp;
        pp = s;
    }
    return p;
}

//recursivo
int fibr(int *n) {
    if (*n == 1) return 0;
    if (*n == 2) return 1;
    int n1 = *n-1, n2 = *n-2;
    return fibr(&n1) + fibr(&n2);
}

void main() {
    int a;
    printf("Digite um inteiro: ");
    scanf("%d", &a);
    printf("%do elemento: %d\n", a, fibr(&a) );
}