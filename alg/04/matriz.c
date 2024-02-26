#include<stdio.h>

void main() {
  int matriz[3][4];
  for(int i = 0; i < 3; i++)
    for(int j = 0; j < 4; j++)
      matriz[i][j] = i+j;

  printf("\n");

  for(int i = 0; i < 3; i++) {
    for(int j = 0; j < 4; j++)
    	printf("%d ", matriz[i][j]);
    printf("\n");
  }
  
}