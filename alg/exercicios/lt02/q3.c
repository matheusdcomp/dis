#include<stdio.h>

void main() {   

    float base, altura;
    
    printf("Digite a base a altura do triangulo: ");
    scanf("%f %f", &base, &altura);

    int resposta = (base*altura)/2;

    printf("Area do triangulo: %d\n", resposta );
    
}