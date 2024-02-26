#include<stdio.h>

void main() {

  printf("\n\nO ideal eh que as atribuicoes sejam sempre do mesmo tipo: ");
  int i = 5;
  float f = 2.5;
  char c = 'H';
	printf("\nint i = 5\t-> i = %d", i);
  printf("\nfloat f = 2.5\t-> f = %f", f);
  printf("\nchar c = 'H'\t-> c = %c", c);

  printf("\n\nMas as vezes a gente precisa misturar:");
  i = 2.5;
  f = 5;
  c = 72;
	printf("\nint i = 2.5\t-> i = %d\n2.5 foi convertido em 2 para ser armazenado em i\n", i);
  printf("\nfloat f = 5\t-> f = %f\n5 foi convertido em 5.0 para ser armazenado em f\n", f);
  printf("\nchar c = 72\t-> c = %c\n72 foi convertido em 'H' para ser armazenado em c\n", c);

  printf("\n\n%s\n%s\n%s\n", 
    "Somar uma variavel int com outra float e atributir o resultado em",
    "uma variavel int vai fazer com que a soma resulte em um float que",
    "depois eh convertido em um int para poder ser armazenado.");
	int x = 2 + 1.5;
	printf("\nint x = 2 + 1.5\nint x = 2.0 + 1.5\nint x = 3.5\nint x = %d\n\n", x);

}
