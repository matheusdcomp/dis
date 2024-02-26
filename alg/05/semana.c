#include<stdio.h>

enum semana { domingo, segunda, terca, 
  quarta, quinta, sexta, sabado };

void main() {
  enum semana s1 = terca;
  enum semana s2 = quinta;
  enum semana s3 = s1 + s2; 
  printf("\nDomingo = %d", domingo);
  printf("\nDia resultante = %d", s3);
}
