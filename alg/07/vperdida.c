#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main() {
  char *primeiro = (char*) calloc(30, sizeof(char));
  for (int i = 0; i < 3; i++) {
    char *nm = (char*) calloc(30, sizeof(char));
    printf("Digite um nome: ");
    setbuf(stdin, NULL);
    fgets(nm, 30, stdin);
    if (i == 0 || strcmp(primeiro, nm) > 0) strcpy(primeiro,nm);
  }
  printf("\nPrimeiro nome em ordem alfabetica: %s", primeiro);
  return 0;
}
//indetifique em quais trechos de código acontece os conceitos: (a) curto; (b) inferencia tipo