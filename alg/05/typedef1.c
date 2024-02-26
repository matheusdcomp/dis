#include<stdio.h>

struct ponto {
  float x, y;
};

typedef struct ponto pnt;

void main() {
  pnt p = { 1, 3 };
  printf("\n(%.1f,%.1f)\n", p.x, p.y );
}
