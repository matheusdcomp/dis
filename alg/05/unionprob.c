#include<stdio.h>
#include<string.h>

union numero {
  int inteiro;
  double real;
};

void main() {
  union numero num;
  char resp[10]; 
  printf( "Deseja digitar com numero inteiro ou real: " );
  gets( resp );
  fflush(stdin);
  if ( strcmp(resp, "inteiro") == 0 ) {
    printf( "Digite um numero inteiro: " );
    scanf( "%d", &num.inteiro );
    fflush(stdin);
    printf( "\nVoce digitou: %lf\n", num.real );
  }
  else {
    printf( "Digite um numero real: " );
    scanf( "%lf", &num.real );
    printf( "\nVoce digitou: %d\n", num.inteiro );
  }
}

