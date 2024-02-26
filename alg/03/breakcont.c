#include<stdio.h>

void main() {
	int x = 0; 
	while ( 1 ) {
  		printf("\n%s %s: ", 
    		"Digite um inteiro positivo para ver se eh par ou impar", 
   			"ou um negativo para sair do programa: ");
  		scanf( "%d", &x );
  		
  		if (x == -1 ) 
  			break;
  		if (x < -1) {
  			printf("%d nao vale!", x);
  			continue;
  		}
  		
  		if ( x % 2 == 0 ) 
    		printf( "\n%d eh par\n", x );
  		else              
    		printf( "\n%d eh impar\n", x );
	}

}