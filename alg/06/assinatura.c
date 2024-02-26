#include<stdio.h>

void main(void);			//linha 7
void imprimeImpar (int);	//linha 12
void imprimePar (int);		//linha 17

void main() {
  imprimeImpar(4);
  imprimePar(3); 
}

void imprimeImpar (int x) {
  if ( x % 2 == 0  ) imprimePar(x); 
  else printf("\n %d eh impar.\n", x);
}

void imprimePar (int x) {
  if ( x % 2 != 0  ) imprimeImpar(x); 
  else printf("\n %d eh par.\n", x);
}
