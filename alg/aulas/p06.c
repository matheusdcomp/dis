#include <stdio.h>

void main() {
  char x;
  printf("Digite um caractere: ");
  scanf("%c", &x);

  if ((x >= 'A' && x <= 'Z') || ((x >= 'a' && x <= 'z'))) {
    printf("%c eh uma letra.\n", x);
  }
  else if (x >= '0' && x <= '9'){
    printf("%c eh um digito.\n", x);
  }  
  else if (x == '+' || x == '-' || x == '*' || x == '/' || x == '%') {
    printf("%c eh um operador aritmetico.\n", x);
  }  
  else if (x == '>' || x == '<') {
    printf("%c eh um operador relacional.\n", x);
  }
  else if (x == '&' || x == '|' || x == '!') {
    printf("%c eh um operador lógico.\n", x);
  }
  

}