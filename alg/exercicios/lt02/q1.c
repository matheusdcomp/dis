#include<stdio.h>

void main() {   

    float a, b, c;
    
    printf("Digite tres numeros: ");
    scanf("%f %f %f", &a, &b, &c);

    float media = (a+b+c)/3.0;
    printf("Media: %f\n", media );
    
}