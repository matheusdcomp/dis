#include<stdio.h>

void main() {
  int b, e, r = 1;
  printf("Digite a base e o expoente: ");
  scanf("%d %d", &b, &e);
  int x = e;
  while(x > 0) {
    r *= b;
    x--; 
  }

  printf("%d eleveado a %d eh %d\n", b, e, r);
 
}