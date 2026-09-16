#include<stdio.h>

void main() {

    int a, b;
    printf("Digite 2 inteiros: ");
    scanf("%d %d", &a, &b);

    if (a == b)
      printf("\nOs 2 numeros sao iguais.\n");
    else
      if ( a < b )
        printf("\n%d eh o menor e %d eh o maior.\n", a, b);
      else
        printf("\n%d eh o menor e %d eh o maior.\n", b, a);
          

}