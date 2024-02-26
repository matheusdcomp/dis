#include<stdio.h>
#define PI 3.1415;

void main() {
   float raio;
   printf("Digite o raio: ");
   scanf("%f", &raio);
   float c = 2 * raio * PI;
   printf( "\nO comprimento da circunferencia eh: %f", c );
} 