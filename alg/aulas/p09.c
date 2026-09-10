#include<stdio.h>
#include<math.h>

void main() {
  int x, d = 2, ehPrimo = 1;
  printf("Digite um inteiro positivo: ");
  scanf("%d", &x);

  if (x == 1 || x == 0)
    printf("%d nao eh primo.\n", x);
  else {
    while (ehPrimo && d <= sqrt(x) ) {
      if (x % d == 0) {
        printf("%d nao eh primo.\n", x);
        ehPrimo = 0;
      }
      d++;
    }
    if (ehPrimo)
      printf("%d eh primo.\n", x);
  }
}