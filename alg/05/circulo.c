#include<stdio.h>

struct ponto {
  float x, y;
};


struct circulo {
  struct ponto centro;
  float raio;
};

void main() {
  
  struct circulo c; 
  c.centro.x = 4.0; 
  c.centro.y = 3.0; 
  c.raio = 2.5;

  printf("Centro do circulo: (%.1f, %.1f)\n", 
    c.centro.x, c.centro.y);

  float area = 3.14 * c.raio * c.raio;

  printf("Area do circulo: %.1f\n", area);

}
