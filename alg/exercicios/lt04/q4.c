/*
4.	A série de Fibonacci inicia com os números 0 e 1 e 
os demais termos são definidos pela soma dos dois anteriores. 
Crie um programa que solicita do usuário a posição de um 
termo (int) e calcule qual é este termo. 
Fibonacci: 0 1 1 2 3 5 8 13 21 ... 
Por exemplo, se o usuário informar 7 (sétimo termo), 
a resposta é 8.
*/

#include<stdio.h>

void main() {
   int s, n, p = 0, pp = 1;
   printf("Digite a posicao do termo que desejar descobrir: ");
   scanf("%d", &n) ;
   
   for ( int i = 2; i <= n; i++ ) {      
      s = p + pp;
      p = pp;
      pp = s;      
   }

   printf("\nO %d-esimo termo eh %d.\n", n, p);
}

