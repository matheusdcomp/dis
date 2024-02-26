#include <stdio.h>

void imprime (char *v) {
   for (int i = 0; v[i] != '\0'; i++)
      printf("%c", v[i]);
}

void main() {    
  char *str1 = "LINGUAGEM C";
  printf("\n\nstr1: %s", str1);
  printf("\n\nFuncao imprime: ");
  imprime(str1);
}
