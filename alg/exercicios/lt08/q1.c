/*
Crie uma função recursiva que recebe 2 inteiros e 
retorna a multiplicação de todos os números entre eles 
(conjunto fechado). Crie um programa que solicita do 
usuário dois inteiros e imprime o resultado da função
anterior.
*/

#include<stdio.h>

int multEntre(int,int);
void main();

int multEntre(int x, int y) {
    if (x > y) return 1;
    return x * multEntre(x+1, y); 
}

/*
m(2,4)
2 * m(3,4)
2 * 3 * m(4,4)
2 * 3 * 4 * m(5,4)
2 * 3 * 4 * 1

Recursão em cauda: última operação é a chamada recursiva
int multEntreRC(int x, int y, int m) {
    if (x > y) return m;
    return multEntreRC(x+1, y, x*m); 
}

int multEntre(int x, int y) {
    return multEntre(x,y,1); 
}
*/

void main() {
    int a, b;
    printf("Digite dois inteiros, sendo o 1o menor: ");
    scanf("%d %d", &a, &b);
    printf("Multiplicacao entre %d e %d: %d\n", 
        a, b, multEntre(a,b));
}