#include<stdio.h>
#include<stdlib.h>

typedef struct {
  char nome[50];
  int idade;
} pessoa;

void main() {

  int q = 0, op;
  const char nome_arq[] = "pessoas.txt";
  FILE * arq;

  while (1) {
    printf("\n\n0 SAIR\n1 CADASTAR\n2 VER\nOPCAO: ");
    scanf("%d", &op);
    switch(op) {
      case 0:
        return;
      case 1:
        pessoa p;
        printf("\nNome: ");
        scanf(" %s", p.nome);
        printf("\nIdade: ");
        scanf("%d", &p.idade);
        arq = fopen(nome_arq, "a");
        fprintf(arq, "%s %d\n", p.nome, p.idade);
        fclose(arq);
        break;
      case 2:
        arq = fopen(nome_arq, "r");
        while(!feof(arq)) {
          printf("%c", fgetc(arq));
        }  
        fclose(arq);
    }
  }

}