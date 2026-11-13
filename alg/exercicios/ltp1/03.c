#include<stdio.h>

void main() {
  int s, h, m, ss;

  printf("Digite o tempo em segundos: ");
  scanf("%d", &s);

  h = s / 3600;
  m = s % 3600 / 60;
  ss = s % 3600 % 60;

  printf("%d sao %d horas, %d minutos e %d segundos.\n", s, h, m, ss);
}