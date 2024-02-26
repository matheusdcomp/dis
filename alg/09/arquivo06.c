#include<stdio.h>
#include<stdlib.h>

int main() {

	FILE* arq = fopen("arquivo06.txt","w+b");
	if (arq == NULL) {
		printf("\nERRO NA ABERTURA DO ARQUIVO.\n");
		exit(1);
	}


	//escrita
	int a = 2;
	double b = 11.656;
	char str[6] = "hello";
	
	fwrite(&a, sizeof(int), 1, arq); //variável, bytes, quantidade, arquivo
	fwrite(&b, sizeof(double), 1, arq);
	fwrite(str, sizeof(char), 6, arq);


	//leitura
	fseek(arq, 0, SEEK_SET); //retorna para o início do arquivo

	int x = 2;
	double y = 11.656;
	char outra[6];

	fread(&x, sizeof(int), 1, arq);
	fread(&y, sizeof(double), 1, arq);
	fread(outra, sizeof(char), 6, arq);

	printf("\nConteudo do arquivo:\t%d\t%lf\t%s\n\n", x, y, outra);

	fclose(arq);

	return 0;
}