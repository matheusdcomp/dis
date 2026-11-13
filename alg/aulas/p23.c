#include<stdio.h>

typedef enum semana {
  SEGUNDA=10, TERCA=11, QUARTA=12
} sem;

void printSemana(enum semana dia) {
  switch(dia) {
    case SEGUNDA: 
      printf("SEGUNDA");
      return;
    case TERCA: 
      printf("TERÇA");
      return;
    case QUARTA: 
      printf("QUARTA");
      return;
  }
}


void main() {
 
  sem dia = SEGUNDA;

  int x = 10;

  int d = SEGUNDA;

  printf("Dia da semana: ");
  printSemana(dia);

  printf("\nDia da semana: %d\n", dia);
  
}
