#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main() {

	FILE* arq = fopen("arquivo05.txt","w+");
	if (arq == NULL) {
		printf("\nERRO NA ABERTURA DO ARQUIVO.\n");
		exit(1);
	}

	//escrita
	char *str1 = (char*) malloc(sizeof(char));
	printf("Digite uma string: ");
	gets(str1);

	int res = fputs(str1, arq);

	if (res == EOF) {
		printf("\nERRO NA ESCRITA DO ARQUIVO.\n");
		exit(1);
	}

	//leitura
	fseek(arq, 0, SEEK_SET); //retorna para o início do arquivo

	char *str2 = (char*) malloc(sizeof(char));
	char *retorno = fgets(str2, strlen(str1)+1, arq);

	if (retorno == NULL) {
		printf("\nERRO NA LEITURA DO ARQUIVO.\n");
		exit(1);
	}

	printf("\nConteudo do arquivo:\n\n%s\n\n", str2);

	fclose(arq);

	return 0;
}