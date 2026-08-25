#include<stdio.h>

void main() {

    int a;
    printf("Digite um inteiro entre 2 e 10: ");
    scanf("%d", &a);

    switch ( a ) {

        case 2: case 3: case 5: case 7:
          printf("%d eh primo.\n", a);
          break;

        case 4: case 6: case 8: case 9: case 10:
          printf("%d nao eh primo.\n", a);
          break;

        default:
          printf("Voce nao digitou um numero entre 2 e 10.\n");  
        
    }          

}