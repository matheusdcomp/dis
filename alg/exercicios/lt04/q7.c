/*
7.	Faça um programa que solicite dois inteiros (a e b)
e um caractere (c) e desenha um retângulo axb usando o 
caractere c. Por exemplo, se a = 4, b = 5 e c = '*', 
o resultado é:

*
** 
**** 
***** 

*/

#include<stdio.h>

void main() {

  int a;
  char c;

  printf("Digite dois inteiros e um caractere: ");
  scanf("%d %c", &a, &c);

  for (int lin = 1; lin <= a; lin++) {
    for (int col = 1; col <= lin; col++) {
      printf("%c", c);
    }
    printf("\n");
  }



}

