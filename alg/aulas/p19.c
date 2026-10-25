#include<stdio.h>

void main() {

  const int LIN = 2, COL = 3;
  int a[LIN][COL];
  for (int l = 0; l < LIN; l++) 
    for (int c = 0; c < COL; c++) {
      printf("Digite um inteiro na posição [%d][%d]: ", l, c);
      scanf("%d", &a[l][c]);
    }

  printf("\n\n");

  for (int l = 0; l < LIN; l++) {
    printf("| ");
    for (int c = 0; c < COL; c++) 
      printf(" %d |", a[l][c]);
    printf("\n");
  }
  
  
}