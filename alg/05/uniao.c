#include<stdio.h>

union numero {
  int inteiro;
  double real;
};

void main() {
  union numero n1, n2;
  int op; 
  while(1) {
    printf( "\n\nDeseja digitar: 0 sair; 1 inteiro; 2 real: " );
    scanf("%d", &op);
    
    if (op == 0)
      break;

    else if ( op == 1 ) {
      printf( "\nDigite 2 inteiros: " );
      scanf( "%d %d", &n1.inteiro, &n2.inteiro );
      printf( "\nSoma: %d\n", n1.inteiro +  n2.inteiro);
    }
    else if ( op == 2 ) {
      printf( "\nDigite 2 reais: " );
      scanf( "%lf %lf", &n1.real, &n2.real );
      printf( "\nSoma: %lf\n", n1.real +  n2.real);
    }
  }

}

