#include<stdio.h>

void main() {
   float raio;
   const float PI = 3.1415;

   printf("Digite o raio: ");
   scanf("%f", &raio);   
   float c = 2 * raio * PI;
   printf( "\nO comprimento da circunferencia eh: %f", c );
} 