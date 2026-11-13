#include<stdio.h>

void main() {

  float t=0, v; 
  int q;
  char c;
  while (1) {
    printf("Digite o valor e a quantidade do produto: ");
    scanf("%f %d", &v, &q);
    t += v * q;
    printf("Deseja comprar outro produto (s/n)? ");
    scanf(" %c", &c);
    if (c == 'n' || c == 'N') break;
  }
  printf("\nTotal: %.2f\n", t);
} 