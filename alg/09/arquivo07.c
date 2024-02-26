#include<stdio.h>
#include<stdlib.h>

int main() {

	FILE* arq = fopen("arquivo07.txt","w+");
	if (arq == NULL) {
		printf("\nERRO NA ABERTURA DO ARQUIVO.\n");
		exit(1);
	}


	//escrita
	int a = 2;
	double b = 11.656;
	char str[6] = "hello";
	
	fprintf(arq,"A: %d\nB: %lf\nSTR: %s\n", a, b, str);


	//leitura
	fseek(arq, 0, SEEK_SET); //retorna para o início do arquivo

	int x = 2;
	double y = 11.656;
	char outra[6], texto[5];

	fscanf(arq,"%s %d", texto, &x);
	printf("\n%s %d", texto, x);
	fscanf(arq,"%s %lf", texto, &y);
	printf("\n%s %lf", texto, y);
	fscanf(arq,"%s %s", texto, outra);
	printf("\n%s %s\n\n", texto, outra);

	fclose(arq);

	return 0;
}