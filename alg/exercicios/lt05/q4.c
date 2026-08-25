#include<stdio.h>

void main() {
   int s, n, p = 0, pp = 1;
   printf("Digite a posicao do termo que desejar descobrir: ");
   scanf("%d", &n) ;

   for ( int i = 2; i <= n; i++ ) {      
      s = p + pp;
      p = pp;
      pp = s;      
   }

   printf("\nO %d-esimo termo eh %d.\n", n, p);
}

