#include<stdio.h>

int fatorial(int y) {
  int fat = 1;
  while (y > 1) { 
    fat = fat * y--; 
  }
  return fat;
}

void main() {
  int n;
  printf("Digite um inteiro: ");
  scanf("%d", &n);
  int f = fatorial(n);
  printf("Fatorial de %d: %d\n", n, f);
}
/*
END   NOME    VALOR
E01   n       3
E02   f       6
E03   
E04   
E05
*/