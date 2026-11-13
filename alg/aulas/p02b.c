#include<stdio.h>

void main() {
  
  int x;
  printf("Digite um inteiro: ");
  scanf("%d", &x);

 
  (x % 2 == 0) ? 
    printf("%d eh par.", x) :  
    printf("%d eh impar.", x);



}