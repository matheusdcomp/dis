#include<stdio.h>
void main() {
  char x; 
  do {
     printf( "\nDigite um caractere: " );
     scanf( "%c", &x );
     printf( "%d\n", (int) x );
  } while (x != '0');
}
