#include<stdio.h>

void main() {
 
  int n, c = 0;
  printf("Digite um inteiro positivo: ");  
  scanf("%d", &n);

  for (int i = 1; i <= n; i++) {
    
    for (int d = 1; d <= i; d++) {      
      printf("%d ", ++c);
    }
    printf("\n");   
  }
  
}

/* q5
a) Qual o valor de a após as instruções: int a = 8; a += a++;
int a = 8;
a = a + a; (a = 8 + 8)
a++; (16 + 1)
a = 17

b) Por que 1 <= a <= 10 é incorreto? Como é o certo?
Porque 1 <= a <= 10 vai fazer 1 <= a primeiro e isso retorna 1 ou 0, 
que vai ser comparado como <= 10.
O certo é 1 <= a && a <= 10

c)Por que if (x = 10) {...} sempre é executado?
Porque x = 10 é uma atribuição e não uma compração de igualdade.
Portanto, x = 10 resulta em 10, que sempre é verdade 
porque qualquer valor diferente de zero é verdade.

d) Por que em int x = 1/2; o valor de x é zero.
Porque 1/2 resulta em 0.5 e x, sendo uma variável inteira,
só armazena a parte inteira do valor, ignorando a parte fracionária. 
*/