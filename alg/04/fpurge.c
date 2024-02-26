#include<stdio.h>

void main() {

	char frase[30];
	   
	for ( int i = 0; i < 3; i++ ) {
	  printf( "Digite uma frase: " );
	  scanf( "%s", frase );
	  printf( "Primeira palavra: %s\n", frase );
	  __fpurge(stdin); //fflush(stdin); no windows
	}

}