#include<stdio.h>

void main() {   

    float r;
    
    printf("Digite o raio: ");
    scanf("%f", &r);

    printf("Area da esfera: %f\n", 4 * 3.1415 * r * r );
    printf("Volume da esfera: %f\n", 
       4 * 3.1415 * r * r * r / 3 );
    
}