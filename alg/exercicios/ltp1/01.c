#include<stdio.h>

void main() {

  float v0, a, t;

  printf("Digite a velocidade inicial, a aceleracao e o tempo: ");
  scanf("%f %f %f", &v0, &a, &t);

  printf("Velocidade atual: %.2f", v0 + a * t);
}