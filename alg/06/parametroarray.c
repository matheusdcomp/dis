#include<stdio.h>

void maiorQ0(int x) {
  if (x > 0)
  	printf("%d eh maior do que zero.\n", x);
}

void maiorQZero(int a[]) {
  for (int i = 0; i < 5; i++) 
    if (x > 0)
  	  printf("%d eh maior do que zero.\n", a[i]);	
}

void main() {
  int v[5] = {1,-2,3,-4,5};

  for (int i = 0; i < 5; i++) 
    maiorQ0(v[i]);

  maiorQZero(v);
}
