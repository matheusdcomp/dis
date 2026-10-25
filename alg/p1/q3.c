#include<stdio.h>

void main() {
 
  int n;
  double e, f;
  printf("Digite um inteiro positivo: ");
  scanf("%d", &n);

  for (int i = 1; i <= n; i++) {
    f = 0;
    for (int d = 1; d <= i; d++) {
      if ( i % d == 0)
        f += d;
    }
    if (i % 2 == 0) e += f/i;
    else            e -= f/i;    
  }

  printf("E = %f", e);
  
}