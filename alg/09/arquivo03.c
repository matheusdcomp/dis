#include<stdio.h>
#include<stdlib.h>

int main() {

	FILE* arq;

	//escrita
	char string[100];

	arq = fopen("arquivo03.txt","a");

	if (arq == NULL) {
		printf("\nERRO NA ABERTURA DO ARQUIVO.\n");
		exit(1);
	}

	printf("Digite uma string: ");
	gets(string);

	for (int i = 0; string[i] != '\0'; i++)
		fputc(string[i], arq);

	fclose(arq);

	//leitura
	char c;

	arq = fopen("arquivo03.txt","r");

	if (arq == NULL) {
		printf("\nERRO NA ABERTURA DO ARQUIVO.\n");
		exit(1);
	}

	printf("\nConteudo do arquivo:\n\n");

	for ( c = fgetc(arq); c != EOF; c = fgetc(arq))
		printf("%c", c);
	

	fclose(arq);

	printf("\n\n");

	return 0;
}