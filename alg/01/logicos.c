#include<stdio.h>

void main() {

	int x, y, z;

  printf("Digite 3 inteiros: ");
  scanf("%d %d %d", &x, &y, &z);

  //O operador AND (&&)
  // F && F resulta em F
  // F && V resulta em F
  // V && F resulta em F
  // V && V resulta em V
  printf("\n%d > %d && %d > %d ? ", x, y, y, z);
  x > y && y > z ?
  printf("Verdadeiro\n"):
  printf("falso\n");

  //O operador OR (||)
  // F || F resulta em F
  // F || V resulta em V
  // V || F resulta em V
  // V || V resulta em V
  printf("\n%d > %d || %d > %d ? ", x, y, y, z);
  x > y || y > z ?
  printf("Verdadeiro\n"):
  printf("falso\n");
  
  //O operador NOT (!)
  // !F resulta em V
  // !V resulta em F
  printf("\n!(%d > %d) ? ", x, y);
  !(x > y) ?
  printf("Verdadeiro\n"):
  printf("falso\n");

}
