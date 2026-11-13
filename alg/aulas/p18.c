#include<stdio.h>
#include<string.h>

int tamanho(char s[]) {
  int t;
  for (t = 0; s[t] != '\0'; t++);
  return t-1;
}

void main() {
  char str1[10];
  printf("Digite uma palavra: ");
  scanf("%s", str1);

   str1[strlen(str1)-1] = '\0';
  printf("\n%s\n", &str1[2]);

  printf("\nTamanho de %s: %d\n", str1, strlen(str1));

}