/*
6.	Faça um programa que leia uma sequência de pares 
de números inteiros quaisquer, sendo dois inteiros 
por linha de entrada. A entrada de dados termina 
quando os dois números lidos forem zero. Este par de 
zeros não deve ser processado e servem para marcar o 
término da entrada de dados. Para cada par A, B de 
números lidos, se B for maior do que A, imprima a 
sequência A, A+1, ... , B-1, B. Caso contrário, 
imprima a sequência B, B+1, ... , A-1, A.
*/

#include<stdio.h>

void main() {

  int a, b, t, s;

  while (1) {
    printf("Digite dois inteiros ou dois 0's para sair: ");
    scanf("%d %d", &a, &b);

    if (!a && !b) break;

    s = 0;

    if (a > b) {
      t = b;
      b = a;
      a = t;
    }
    
    for (int i = a; i <= b; i++)
      s = s + i;
    
    printf("\nSoma: %d\n", s);
  }

}

