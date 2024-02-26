#include<stdio.h>


void fun(int *e) {
 *e = 2;
 int* r = (*int) malloc(sizeof(int));
 *r = 3;
 int *r = *e * *r;
 (*r)++;
}

void main() {
  int a = 5;
  int v[2];
  v[1] = 10;
  int x = *(v+1) + 10;
  int &r = &a;
  fun(&a);
}