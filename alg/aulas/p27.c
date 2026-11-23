#include<stdio.h>

void main() {
  float x[5] = {10,20,30,40,50}; 

  float *p;

  for (int i = 0; i < 5; i++) {
    p = &x[i];
    printf("Valor de x[%d]: %.2f\n", i, x[i]);
    printf("Endereço de x[%d]: %x\n", i, &x[i]);
    printf("Valor do ponteiro p: %x\n", p);
    printf("Valor da variável apontada por p (x[%d]): %.2f\n", i, *p);
    printf("Endereço do ponteiro p: %x\n\n", &p);
  }
}