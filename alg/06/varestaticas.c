#include<stdio.h>

const int TAM = 5;

int contaChamadas( ) {
  static int qtd;
  return ++qtd;
}

void main() {
  for (int i = 0; i < TAM; i++) 
    printf( "\nNumero de chamadas: %d\n", contaChamadas() );
}
