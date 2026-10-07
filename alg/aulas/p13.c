#include<stdio.h>


int divisivel(int a, int b) {
  return !(a % b);
}

int bissexto(int ano) {
  return (divisivel(ano, 4) && !divisivel(ano, 100)) || divisivel(ano, 400);  
}

int primo( int n ) {
  for (int d = 2; d <= n/2; d++)
    if (n % d == 0)
      return 0; //n não é primo
  return 1; //n é primo
}

char int2char(int n) {
  return (char) n;
}

void main() {
  printf("Digite um ano: ");
  int a;
  scanf("%d", &a);
  printf("%d é bissexto: %s\n", a, bissexto(a) ? "Sim" : "Não");

  printf("%d é primo: %s\n", a, primo(a) ? "Sim" : "Não");

  char c = int2char(a);

  printf("%d convertido em char: %c\n", a, c);

}

