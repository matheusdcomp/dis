#include<stdio.h>

void main() {
 
  float k;
  printf("Digite a temperatura em Kelvin: ");
  scanf("%f", &k);
  printf("Temperatura em Fahrenheit: %f", 32 - 1.8 * (k - 273));
  
}