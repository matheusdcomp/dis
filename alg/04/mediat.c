#include<stdio.h>

void main() {
	int t;
	float soma = 0;

  printf("Informe a quantidade de valores: ");
	scanf("%d", &t);

  float valores[t];  
  
  for (int i = 0; i < t; i++) {
    printf("\nDigite o %do valor: ", i+1);
    scanf( "%f", &valores[i] );
    soma += valores[i]; 
  }

  printf("\nMedia: %f", soma/t);

}