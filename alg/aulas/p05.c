#include <stdio.h>

void main() {
  int x;
  do {
    printf("Digite um inteiro positivo ou zero para sair: ");
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
      printf("Fim do programa!\n");
    }
  } while (x > 0);
}