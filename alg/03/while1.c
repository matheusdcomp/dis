#include<stdio.h>

void main() {
  
  char op;
  float area, a, b;

  while (1) {

    printf("\n%s\n%s\n%s\n%s",
         "A - circulo",
         "B - triangulo",
         "C - retangulo",
         "Digite a sua opcao: ");
    scanf("%c", &op); 
        
    if (op == 'S' || op = 's') {
      break; //neste exemplo, o break desloca a execução do programa para fora do while
    }
    else if ( op == 'A' || op == 'a' ) { //aceita A ou a
      printf("\nDigite o raio: ");
      scanf("%f", &a);
      area = 3.1415 * a * a;
      printf("\nArea do circulo: %f\n", area);
    }
    else if ( op == 'B' || op = 'b' ) { //só aceita B
      printf("\nDigite a base a altura: ");
      scanf("%f %f", &a, &b);
      area = a * b / 2;
      printf("\nArea do triangulo: %f\n", area);
    }
    else if ( op == 'C' || op = 'c' ) {
      printf("\nDigite os dois lados: ");
      scanf("%f %f", &a, &b);
      area = a * b;
      printf("\nArea do retangulo: %f\n", area);
    }
    else {
      printf("\nOpcao invalida!\n");      
    }

  }//fim do while

}//fim do main