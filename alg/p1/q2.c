#include<stdio.h>

void main() {
 
  float x,y,z,m;
  int op;
  printf("Digite três números: ");
  scanf("%f %f %f", &x, &y, &z);
  printf("Qual média calcular?\n1 - Aritmética\n2 - Ponderada\n3 - Harmônica: ");
  scanf("%d", &op);
  switch(op) {
    case 1:
      m = (x+y+z)/3;
      printf("Média Aritmética: %f", m);
      break;
    case 2:
      printf("Média Ponderada: %f", (x+2*y+3*z)/6);  
      break;
    default:
      printf("Média Harmônica: %f", 1/(1/x+1/y+1/z));
  }
}