#include<stdio.h>

typedef struct {
  char nome[50];
  float notas[3];
} aluno;

float media(aluno a) {
  return (a.notas[0] + a.notas[1] + a.notas[2]) / 3.0; 
}

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
    printf("\nAluno [%d]:\n  nome: %s\n  notas: ", i, p[i].nome);
    for (int j = 0; j < 3; j++) {
      printf("%.1f\t", p[i].notas[j]);
    }
    printf("\n  media: %.1f\t", media(p[i]));
  }
}
