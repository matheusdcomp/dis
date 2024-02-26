#include<stdio.h>
#include<string.h>

void main() {
	
	char str1[50], str2[50];

	char str3[50];
	strcpy(str3,"Matheus Viana");

	printf("Digite uma string: ");
	gets(str1);

	printf("\nVoce digitou: %s", str1);

	strcpy(str2, str1);
	printf("\nstr2: %s", str2);
	printf("\nstr3: %s", str3);

	if (strcmp(str1,str3) == 0 )
		printf("\n%s e %s sao iguais.", str1, str3);
	else if (strcmp(str1,str3) < 0 )
		printf("\n%s vem antes de %s.", str1, str3);
	else if (strcmp(str1,str3) > 0 )
		printf("\n%s vem depois de %s.", str1, str3);

	printf("\n%s possui %d caracteres.", str1, strlen(str1));


}