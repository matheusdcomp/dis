#include<stdio.h>

void main() {

	int x;

  printf("Digite um inteiro: ");
  scanf("%d", &x);

  int r = x >= 0;

  r == 1 ? printf("\n%d eh positivo\n", x) : printf("\n%d menor que zero\n", x); 

  printf( "\n%d eh par ou impar? %s\n\n", x, (x % 2 == 0 ? "par" : "impar") );

  //Pergunta: porque nao eh correto usar 
  //relacionais em sequencia, como em 10 > 5 > 3?

}
