#include<stdio.h>
#include<stdlib.h>

void fun() {
  int *x = (int*) malloc( sizeof(int) );
  *x = 5;
  printf( "\n*x: %d\tx: %x\n", *x, x );
  free(x);
  x = (int*) malloc( sizeof(int) );
}


void main() { 
  fun(); 
}

/*
END NOME VALOR
E1  
E2   x    E3
E3        ()
*/

