#include<stdio.h>



float maior(float a[], int t) {
  int m = 0;
  for (int i = 1; i < t; i++ )
    if (a[i] > a[m]) 
      m = i;
  return a[m];
}

int buscar(float a[], int t, float x) {
  for (int i = 0; i < t; i++)
    if (x == a[i])
      return i;
  return -1;    
}


float soma(float a[], int t) {
  float s = 0;
  for (int i = 0; i < t; i++) {
    s += a[i];
  }
  return s;
}


void main() {
  const int T = 4;
  float v[T], s = 0, b;

  printf("v = %x\n", v);

  for (int i = 0; i < T; i++) {
    printf("Digite um número: ");
    scanf("%f", &v[i]);
  }

  printf("\nSoma dos valores: %f\n", soma(v,T));
  printf("\nMaior valor: %f\n", maior(v,T));  

  printf("Digite um número para buscar: ");
  scanf("%f", &b);

  int achou = buscar(v, T, b);
  if (achou == -1)
    printf("\nNão existe %f no array.\n", b);
  else
    printf("\n%f está na posição %d do array.", b, achou);  
}