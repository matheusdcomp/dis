#include<stdio.h>

void funcao(int *x) {
  x++;
}

void main() {
  int a = 5; 
  float b = 2.6;

  funcao(&a);

  int c = b;

  void *pv = &a;
  printf("\nValor de pv: %x", pv);
  printf("\nValor da variavel apontada por pv: %d", *(int*)pv);

  pv = &b;
  printf("\nValor de pv: %x", pv);
  printf("\nValor da variavel apontada por pv: %f", *(float*)pv);
}