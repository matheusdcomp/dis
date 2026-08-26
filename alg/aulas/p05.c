#include <stdio.h>

void main() {
  int x;
  printf("Digite um inteiro positivo: ");
  scanf("%d", &x);

  if (x > 0) {
    if (x % 2 == 0) {
      printf("%d eh par.\n", x);
    }
    else {
      printf("%d eh impar.\n", x);
    }
  }
  else {
    printf("Voce nao digitou um inteiro positivo!\n");
  }
}