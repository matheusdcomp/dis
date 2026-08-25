/*Faça um programa que calcule a média de n números informados pelo
usuário até ele informar o número 0. Por exemplo, se o usuário
informar os números 9 6 2 8 0, o programa deve calcular a média (9
+ 6 + 2 + 8) / 4.
*/

#include<stdio.h>

void main() {

    float n, m = 0, q=0;

    do {

      printf("Digite um numero ou 0 para sair: ");
      scanf("%f", &n);

      if ( !n ) break;
      
      m += n;
      q++;
      
    } while(1);

    printf("Media: %f\n", m/q );     

}