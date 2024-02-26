#include<stdio.h>
#include<stdlib.h>

int main() {

	FILE* arq;

	char string[100];

	arq = fopen("arquivo01.txt","a");

	if (arq == NULL) {
		printf("\nERRO NA ABERTURA DO ARQUIVO.\n");
		exit(1);
	}

	printf("Digite uma string: ");
	gets(string);

	for (int i = 0; string[i] != '\0'; i++)
		fputc(string[i], arq);

	fclose(arq);

	return 0;
}