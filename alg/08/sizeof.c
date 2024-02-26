#include<stdio.h>

void main() {
  int a = 5;
  int ta = sizeof a;
  int tdouble = sizeof (double);
  printf( "\nTamanho da variavel a (int) em bytes: %d", ta);
  printf( "\nTamanho do tipo double em bytes: %d\n", tdouble);
}
