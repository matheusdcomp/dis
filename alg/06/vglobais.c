#include<stdio.h>

const int TAM = 5;
int v[5];

void obterArray ( ) {
  for (int i = 0; i < TAM; i++) 
    v[i] = i;
}

void main() {
  obterArray();
  for (int i = 0; i < TAM; i++) 
    printf( " %d ", v[i] );
}
