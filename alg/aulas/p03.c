#include<stdio.h>

void main() {
  int x;
  printf( "Digite um inteiro: " );
  scanf( "%d", &x );

  if (x > 0)
    printf( "%d eh maior que 0.\n", x );
  
  if (x > 10)
    printf( "%d eh maior que 10.\n", x );
    
  if (x > 100)
    printf( "%d eh maior que 100.\n", x );
}
