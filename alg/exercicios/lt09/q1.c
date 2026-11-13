/*
Implemente um programa que que solicita dois números e 
calcula a soma entre eles. Neste programa, para cada 
variável que você necessitar declarar, você deve depois 
criar um ponteiro para ela e acessá-la somente
por meio do ponteiro.
*/

#include<stdio.h>

void main() {
    int a, b, s, i; 
    int *pa = &a, *pb = &b, *ps = &s, *pi = &i;
    printf("Digite dois inteiros: ");
    scanf("%d %d", pa, pb);
    for (*pi = *pa; *pi <= *pb; (*pi)++)
        *ps += *pi;
    printf("Soma entre %d e %d: %d\n", *pa, *pb, *ps);
}