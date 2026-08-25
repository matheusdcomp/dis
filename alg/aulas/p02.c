#include<stdio.h>

void main() {
  
  char x;
  printf("Digite um caractere: ");
  scanf("%c", &x);

  if (('A' <= x && x <= 'Z') || (x >= 'a' && x <= 'z')) {
    printf("%c", x);
    printf(" eh uma letra.\n");
  }
  else {
    printf("%c", x);
    printf(" nao eh uma letra.\n");
  }
  printf("Fim do programa.\n");
}