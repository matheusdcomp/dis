
#include <stdio.h>
#include <math.h>

int ehPrimo( int n ) {
	for ( int i = 2; i < sqrt(n); i++ )
		if ( n % i == 0 ) 
			return 0;
	return 1;	
}
 
int main(){    
  int x;
  printf( "\nDigite um inteiro positivo: " );
	scanf( "%d", &x ); 
	switch( x ) {
	  default:
	    if ( ehPrimo(x) )	
	      case 2: case 3: case 5: case 7:
	      printf( "\n %d eh primo.\n", x );
	    else   	  	
			  case 4: case 6: case 8: case 10:
			  printf( "\n %d nao eh primo.\n", x );
	}
	return 0;
}
