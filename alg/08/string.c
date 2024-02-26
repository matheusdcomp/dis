
#include <stdlib.h>
#include <string.h>

void imprime (char *v, int n) {
   for (int i = 0; i < n; i++)
      printf(v[i]);
}
 
void main(){

	char* str = (char*) malloc(sizeof(char));
	strcpy(str,"PROGRAMACAO");
	printf("\nstr: %s", str);

	char str2[50] = "LINGUAGEM C";
	printf("\n\nstr2: %s", str2);

	char *str3 = str2;
	printf("\n\nstr3: %s", str3);

	printf("\n\nFuncao imprime: ");
	int t = strlen(str3);
	imprime(str3,t);

	printf("\n\n");
}
