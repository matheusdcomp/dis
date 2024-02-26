#include<stdio.h>

void main() {

	int a = 5;
  float b = 2.0;
  char c = 'A';

	printf("\n\nOperacoes de tipos iguais resultam no mesmo tipo: ");
	printf("\n\t%d + %d = %d", a, a, a+a);
	printf("\n\t%d / %d = %d", a, a, a/a);
	printf("\n\t%f + %f = %f", b, b, b+b);
  printf("\n\t%f / %f = %f", b, b, b/b);

  printf("\n\nOperacoes com int e float resultam em float: ");
	printf("\n\t%d + %f = %f", a, b, a+b); 
	printf("\n\t%f + %d = %f", b, a, b+a);
  printf("\n\t%d / %f = %f", a, b, a/b);
  printf("\n\t%f / %d = %f", b, a, b/a);

  printf("\n\nOperacoes enter dois char ou entre char e int usam o codigo ASCII do char: ");
	printf("\n\t%c + %c = %c", c, c, c+c); 
	printf("\n\t%c + %d = %c", c, a, c+a);
  printf("\n\n");

  //Observacoes: 
  //float misturado com double resulta em double.
  //Jamais misture char com float ou double.
  
}
