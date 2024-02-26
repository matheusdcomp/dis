#include<stdio.h>
#include<string.h>

void troca(char* a, char* b) {
  int aux = *a;
  *a = *b;
  *b = aux;
}

void inverte ( char str[] ) {
  int i = 0;
  int f = strlen(str) - 1;
  while( i <= f ) 
    troca(&str[i++],&str[f--]);
}

void main() {
  char nm[10] = "JOAO";
  printf("\nString original: %s\n", nm);
  inverte(nm);
  printf("\nString invertida: %s\n", nm);
}
