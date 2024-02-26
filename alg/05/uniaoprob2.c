#include<stdio.h>

union numero {
  int inteiro;
  float real;
};

void main() {
  union numero num;
  num.inteiro = 27;
  printf( "\n%f\n", num.real );
}

