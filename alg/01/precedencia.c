#include<stdio.h>

void main() {
  //Os operadores aritmeticos de C seguem as regras de 
  //precedencia e associatividade da matemática
  int r = 5 + 2 * 4 / (2-1);
  printf("\n5 + 2 * 4 / (2-1) = %d\n", r);

  //Os operadores relacionais tem menor precedencia do que os aritmeticos
  printf("\n5 + 2  > 5 * 2 ? ");
  5 + 2  > 5 * 2 ?
    printf("Verdadeiro\n"):
    printf("falso\n");

  //Os operadores logicos tem menor precedencia do que os relacionais e aritméticos
  //O operador AND (&&) tem maior precedencia do que o OR (||)
  printf("\n10 < 1 || 5 > 10 && 10 > 1 ? ");
  10 < 1 || 5 > 10 && 10 > 1  ?
    printf("Verdadeiro\n"):
    printf("falso\n");
}