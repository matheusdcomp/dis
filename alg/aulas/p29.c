#include <stdio.h>


typedef struct {float valor;} real; 
typedef struct { real x, y; } Ponto;

void main() {
  int a = 5;
  int *b = &a; 
  printf("\n %d \n", *b); 

  Ponto ponto = {{2.5}, {4.0}};
  Ponto *p = &ponto;
  printf("\n (%.1f,%.1f) \n", ponto.x.valor, ponto.y.valor); 
  printf("\n (%.1f,%.1f) \n", (*p).x, p->y.valor);
}