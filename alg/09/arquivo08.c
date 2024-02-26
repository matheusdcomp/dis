#include<stdio.h>
#include<stdlib.h>

void main() {

  FILE* arq = fopen("arquivo08.txt","w+");
  if (arq == NULL) {
	printf("\nERRO NA ABERTURA DO ARQUIVO.\n");
	exit(1);
  }

  int a = 2, b = 5; 	
  fprintf(arq,"A: %d\nB: %d\n", a, b); //escrita

  fseek(arq, 0, SEEK_SET); //retorna para o início do arquivo

  int x, y;
  char t1[5], t2[5];
  fscanf(arq,"%s %d %s %d", t1, &x, t2, &y); //leitura
  printf("\n%s %d %s %d\n\n", t1, x, t2, y);

  fclose(arq);
}
