#include <stdio.h>

void main () {
   char str[12];
   printf("Digite um texto: ");
   gets(str);
   printf("\nVoce digitou %s.\n", str);
}