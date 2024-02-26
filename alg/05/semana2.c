#include<stdio.h>

enum semana { domingo, segunda, terca, 
  quarta, quinta, sexta, sabado };

void main() {
  enum semana hoje;
  int n; 
  printf("\nQue dia eh hoje? ");
  scanf("%d", &hoje);
  
  printf("\nQuantos dias para frente? ");
  scanf("%d", &n);
  enum semana daquiNdias = (hoje + n) % 7;
  
  switch( daquiNdias ) {
    case domingo: 
      printf("\nDaqui %d dias sera domingo.\n", n); break;
    case segunda: 
      printf("\nDaqui %d dias sera segunda.\n", n); break;
    case terca: 
      printf("\nDaqui %d dias sera terca.\n", n); break;
    case quarta: 
      printf("\nDaqui %d dias sera quarta.\n", n); break;
    case quinta: 
      printf("\nDaqui %d dias sera quinta.\n", n); break;
    case sexta: 
      printf("\nDaqui %d dias sera sexta.\n", n); break;
    case sabado: 
      printf("\nDaqui %d dias sera sabado.\n", n);
  }
}
