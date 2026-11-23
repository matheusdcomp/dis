#include<stdio.h>
#include<string.h>

char* inverte(char *original) {
  int t = strlen(original);
  static char novo[100];  
  for (int i = 0, f = t-1; i < t; i++, f--) {
    novo[i] = original[t];
  } 
  novo[t] = '\0'; 
  return novo;  
}

void main() {
  char str[3];
  char *n = inverte(str);
  printf("\n%s\n", n);
}