#include<stdio.h>

void main() {

  float e = 1;
  int n, f=1; 
  printf("Digite um inteiro positivo: ");
  scanf("%d", &n);

  for (int i = 1; i <= n; i++) {
    f *= i;
    e += 1.0/f;
  }
  printf("\nE: %f\n", e);
}