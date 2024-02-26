#include <stdio.h>
#include <string.h>
 
void main()
{    

	int i = 5;
    char a[] = "ABC";
    char b[] = "DEFGHI"; 
    
    printf( "\nInteiro i: %d", i);
	printf( "\nTamanho do inteiro i: %d", sizeof(i)); 
    printf( "\nEndereco da inteiro i: %x\n", &i); 
	
	printf( "\nString a: %s", a);
	printf( "\nTamanho da string a: %d", sizeof(a)); 
    printf( "\nEndereco da string a: %x\n", &a); 
	
	printf( "\nString b: %s", b);
	printf( "\nTamanho da string b: %d", sizeof(b)); 
    printf( "\nEndereco da string b: %x\n", &b); 
	
	char c[] = "uegrtewkrjthkerktkejrjhk";
	strcat(b, c); //vai além do limite do array, pode sobrescrever outro
    printf( "\nString b: %s", b);
    printf( "\nTamanho da string b: %d", sizeof(b)); 
	printf( "\nEndereco da string b: %x\n", &b);
	 
	printf( "\nString a: %s\n", a );

}
