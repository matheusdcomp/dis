#include<stdio.h>

void main() {

  int n, p=0, e=0, z=0, i = 1; 
  while (i <= 50) {
    printf("Digite um inteiro: ");
    scanf("%d", &n);
    if (n > 0) p++;     
    else if (n < 0) e++;
    else z++;
    i++;
  }
  printf("\nPositivos: %d\nNegativos: %d\nZeros: %d\n", p, e, z);
}