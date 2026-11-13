#include<stdio.h>

void main() {
  int ano;
  printf("Digite um ano: ");
  scanf("%d", &ano);

  if ((ano % 4 == 0 && !(ano % 100 == 0)) || (ano % 400 == 0)) {
    printf("%d eh bissexto.\n", ano);
  }
  else {
    printf("%d nao eh bissexto.\n", ano);  
  }
}
