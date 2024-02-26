#include<stdio.h>

void main() {

  char op;
  float area, a, b;

  while (op != 's' && op != 'S') {

    printf("\n%s\n%s\n%s\n%s",
         "A - circulo",
         "B - triangulo",
         "C - retangulo",
         "Digite a sua opcao: ");
    scanf("%c", &op); 
        
    switch( op ) {

      case 'S': case 's': //entra aqui se digitar S ou s
        printf("\nFIM\n");
        break; //neste exemplo, todos os break deslocam a execução do programa para fora do switch, mas ainda dentro do while

      case 'A': case 'a': //entra aqui se digitar A ou a
        printf("\nDigite o raio: ");
        scanf("%f", &a);
        area = 3.1415 * a * a;
        printf("\nArea do circulo: %f\n", area);
        break;

      case 'B': case 'b': //entra aqui se digitar B ou b
        printf("\nDigite a base a altura: ");
        scanf("%f %f", &a, &b);
        area = a * b / 2;
        printf("\nArea do triangulo: %f\n", area);
        break;  

      case 'C': case 'c': //entra aqui se digitar C ou c
        printf("\nDigite os dois lados: ");
        scanf("%f %f", &a, &b);
        area = a * b;
        printf("\nArea do retangulo: %f\n", area);
        break;

      default:
        printf("\nOpcao invalida!\n");  

    }//fim do switch
    //os break dentro do switch fazem o programa vir para esta linha
  }//fim do while

}//fim do main