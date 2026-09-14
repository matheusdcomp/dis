#include<stdio.h>

void main() {
  int i = 0;
  while ( i < 10) {
    printf("%d ", i); 
    if (i % 2 != 0) 
      continue;     
    i++;
  }

  printf("\nFIM\n");
}