#include<stdio.h>
 
struct pessoa {
  char nome[50];
  int idade;
  float altura;
};

void main() {

  const int TAM = 3;
  struct pessoa pessoas[TAM]; 
  int maisvelho = 0, maisalto = 0; 

  for (int i = 0; i < TAM; i++) {
    printf( "Digite o nome: " );
    gets( pessoas[i].nome );
    fflush(stdin);
    printf( "Digite a idade: " );
    scanf( "%d", &pessoas[i].idade );
    fflush(stdin);
    printf( "Digite a altura: " );
    scanf( "%f", &pessoas[i].altura );
    fflush(stdin);

	if (pessoas[i].idade > pessoas[maisvelho].idade)
	  maisvelho = i;    
	if (pessoas[i].altura > pessoas[maisalto].altura)
	  maisalto = i;    
  }

  printf("\nMais velho:");
  printf("\nNome: %s\nIdade: %d\nAltura: %f", 
    pessoas[maisvelho].nome, 
    pessoas[maisvelho].idade, 
    pessoas[maisvelho].altura );

  printf("\nMais alto:");
  printf("\nNome: %s\nIdade: %d\nAltura: %f", 
    pessoas[maisalto].nome, 
    pessoas[maisalto].idade, 
    pessoas[maisalto].altura );
}
