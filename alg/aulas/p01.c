#include <stdio.h>

void main() {
 
  char a, b;

  printf("Digite uma letra maiuscula: ");
  scanf("%c", &a);

  printf(
    "%s%c\n%s%c\n",
    "Voce digitou: ", 
    a,  
    "Convertendo para minuscula: ", 
    a+32  
  );

  
}