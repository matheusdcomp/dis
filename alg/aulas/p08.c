#include<stdio.h>

void main() {
  
  int x, y, s = 0;
  printf("Digite dois inteiros: ");
  scanf("%d %d", &x, &y);

  do {
    s += x;  //s = s + x;
    x++; //x += 1; ou x = x + 1;
  } while (x <= y);
  
  printf("Soma: %d\n", s);
  

}