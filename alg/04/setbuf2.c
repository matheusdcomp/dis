#include<stdio.h>

void main() {
	char nm[50], sn[50];
	int id;

	printf("Digite o nome: ");
	setbuf(stdin,NULL);	//fflush(stdin); //__fpurge(stdin); no linux
	scanf("%s", nm);
	
	printf("Digite o sobrenome: ");
	setbuf(stdin,NULL);	//fflush(stdin); //__fpurge(stdin); no linux
	scanf("%s", sn);
	
	printf("Digite a idade: ");
	setbuf(stdin,NULL); //fflush(stdin); //__fpurge(stdin); no linux
	scanf("%d", &id);

	printf("\n%s %s, %d anos\n", nm, sn, id);
}