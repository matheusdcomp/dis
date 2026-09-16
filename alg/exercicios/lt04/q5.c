/*
5.	Faça um programa que leia uma quantidade qualquer 
de valores inteiros até o usuário digitar zero (0). 
O programa deve imprimir qual é o maior dos valores 
lidos e qual é o menor. 
*/

#include<stdio.h>

void main() {
  
  int n=1, maior, menor, volta1 = 1;

  while (n) {

    printf("Digite um numero ou 0 para sair: ");
    scanf("%d", &n);
    
    if (!n) break; 

    if (volta1 || n > maior) maior = n;
    if (volta1 || n < menor) menor = n;

    volta1 = 0;
      
  }

  printf("\nMenor: %d\nMaior: %d\n", menor, maior);
  

}

