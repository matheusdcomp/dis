#include<stdio.h>
#include<stdlib.h>

int main() {

	FILE* arq;

	char c;

	arq = fopen("arquivo01.txt","r");

	if (arq == NULL) {
		printf("\nERRO NA ABERTURA DO ARQUIVO.\n");
		exit(1);
	}

	printf("\nConteudo do arquivo:\n\n");
	

	
	while( (c = fgetc(arq)) != EOF ) {
		printf("%c", c);
	}
	

	fclose(arq);

	printf("\n\n");

	return 0;
}