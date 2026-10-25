#include<stdio.h>

typedef struct {
  char nome[50];
  float notas[3];
} aluno;

void main() {
  aluno p[2];
  for (int i = 0; i < 2; i++) {
    printf("Digite o nome do aluno [%d]: ", i);
    scanf("%s", p[i].nome);
    for (int j = 0; j < 3; j++) {
      printf("Digite a nota [%d] do aluno [%d]: ", j, i);
      scanf("%f", &p[i].notas[j]);
    }
  }

  for (int i = 0; i < 2; i++) {
    printf("\nAluno [%d]:\n  nome: %s\n  Notas: ", i, p[i].nome);
    for (int j = 0; j < 3; j++) {
      printf("%.1f\t", p[i].notas[j]);
    }
  }
}
