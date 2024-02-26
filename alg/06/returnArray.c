#include<stdio.h>
#define TAM 5

int* obterArray ( ) {
  static int v[TAM];
  for (int i = 0; i < TAM; i++) 
    v[i] = i;
  return v;
}

void main() {
  int *ns = obterArray();
  for (int i = 0; i < TAM; i++) 
    printf( " %d ", ns[i] );
}
