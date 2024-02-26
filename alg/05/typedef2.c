#include<stdio.h>

typedef struct {
  float x, y;
} ponto;

void main() {
  ponto p = { 1, 3 };
  printf("\n(%.1f,%.1f)\n", p.x, p.y );
}
