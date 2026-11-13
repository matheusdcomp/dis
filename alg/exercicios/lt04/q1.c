/*
1.	Faça um programa que calcule a multiplicação de dois 
números utilizando apenas a operação de soma. 
*/

#include<stdio.h>

void main() {

    int a, b, m = 0;
    printf("Digite dois inteiros, um menor e  outro maior: ");
    scanf("%d %d", &a, &b);
    
    for (int c = 1; c <= b; c++)
        m += a;

    printf("%d x %d = %d\n", a, b, m);     

}