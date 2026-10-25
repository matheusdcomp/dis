#include<stdio.h>

const int LIN = 2, COL = 3;

void dobrar(int x) {
  x = x * 2;
}

void dobrarMatriz(int m[][3] ) {
  for (int l = 0; l < LIN; l++) 
    for (int c = 0; c < c; c++)
      m[l][c] = m[l][c] * 2;
}

void main() {
  int a[LIN][COL];
  for (int l = 0; l < LIN; l++) 
    for (int c = 0; c < COL; c++) {
      printf("Digite um inteiro na posição [%d][%d]: ", l, c);
      scanf("%d", &a[l][c]);
    }
  
  dobrarMatriz(a);

  //for (int l = 0; l < LIN; l++) 
  //  for (int c = 0; c < COL; c++) 
  //    dobrar(a[l][c]);

  for (int l = 0; l < LIN; l++) {
    printf("|");
    for (int c = 0; c < COL; c++) 
      printf(" %d |", a[l][c]);
    printf("\n");
  }
  
}