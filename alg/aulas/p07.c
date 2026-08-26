#include <stdio.h>

void main() {
  int x;
  printf("Digite um inteiro positivo: ");
  scanf("%d", &x);

  switch(x) {
    case 0: case 1: case 4:
      printf("%d não eh primo.\n", x);
      break;
    case 2: case 3: case 5:
      printf("%d eh primo.\n", x);
      break;
    default:
      printf("Nao sei dizer.\n"); 
  }

}