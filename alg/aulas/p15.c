#include<stdio.h>

void main();
void triangulo(int t);

int c;//global

void main() {
  printf("Digite um inteiro e um caractere: ");
  int a;
  scanf("%d %c", &a, &c);
  
  
  triangulo(a);

}

void triangulo(int t) {
  for (int i = 0; i < t; i++) {
    for (int j = 0; j <= i; j++ ) {
      printf("%c ", c);
    }
    printf("\n");  
  }
}


/*
END   NOME          VALOR
E01   a(main)       3
E02   c(global)       *
E03   t(triangulo)  3
E04   c(triangulo)  *
E05                
E06                

*
**
***


*/


