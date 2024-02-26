#include<stdio.h>
#include<string.h>
 
struct pessoa {
  char nome[50];
  int idade;
  float altura;
};

void main() {

  struct pessoa p, x; 
  strcpy(p.nome, "JOAO");
  p.idade = 25;
  p.altura = 1.8;

  x = p;

  printf("\nNome: %s\nIdade: %d\nAltura: %f", 
    x.nome, x.idade, x.altura );  

}
