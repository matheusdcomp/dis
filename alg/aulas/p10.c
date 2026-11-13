#include<stdio.h>

void main() {
  int b=0, e, r = 1;

  while (b != -1 ) {
    printf("Digite um número ou -1 para sair: ");
    scanf("%d", &b);    
    
    if (b != -1) {
     
      printf("Digite o segundo número: ");
      scanf("%d", &e); 

      for(int x = e; x > 0; x-- ) 
        r *= b;      
      printf("%d eleveado a %d eh %d\n", b, e, r);

      r = 1;
      for(int x = b; x > 0; x--) 
        r *= e;   
      printf("%d eleveado a %d eh %d\n", e, b, r);
    }
  }
 
}