#include<stdio.h>

//1
typedef struct { int d, m, a; } data;

typedef struct { char nome[50]; data dnasc; float notas[4]; } aluno;


//2
float mediaAluno(aluno a) {
  return (a.notas[0] + a.notas[1] + a.notas[2] + a.notas[3]) / 4;
}


//3
void imprimeAluno(aluno a) {
  printf(
    "\nNome: %s\nData Nasc.: %02d/%02d/%04d\nNotas: ", 
    a.nome, a.dnasc.d, a.dnasc.m, a.dnasc.a
  );
  for (int i = 0; i < 4; i++)
    printf("%.1f ", a.notas[i]);  
  printf("\nMédia: %.1f\n", mediaAluno(a));  
}


//4
aluno cadastraAluno() {
  aluno a;
  printf("Digite o nome: ");
  scanf("%s", a.nome);
  printf("Digite a data de nascimento (dd mm aaaa): ");
  scanf("%d %d %d", &a.dnasc.d, &a.dnasc.m, &a.dnasc.a);
  printf("Digite as 4 notas: ");
  for (int i = 0; i < 4; i++)
    scanf("%f", &a.notas[i]);  
  return a;  
}


//5 versão iterativa
aluno melhorAluno(aluno alunos[], int i) {
  aluno melhor = alunos[i];  
  for (int j = 0; j < i-1; j++)
    if (mediaAluno(alunos[j]) > mediaAluno(melhor))
      melhor = alunos[j];
  return melhor;
}


//5 versão recursiva
aluno melhorAlunoR(aluno alunos[], int i) {
  if (i == 0) return alunos[0];
  aluno melhor = melhorAlunoR(alunos, i-1);
  if (mediaAluno(alunos[i]) > mediaAluno(melhor))
    melhor = alunos[i];
  return melhor;   
}


//6
void main() {
  aluno alunos[100];
  int op, i = 0;
  while(1) {
    printf("\n\n0 SAIR\n1 CADASTRAR\n2 VER MELHOR\n3 VER TODOS\nOPCAO: ");
    scanf("%d", &op);
    switch(op) {
      case 0:
        return;
      case 1:
        alunos[i] = cadastraAluno();
        i++;
        break;
      case 2:
        imprimeAluno(melhorAlunoR(alunos, i-1));
        break;
      case 3:
        for (int j = 0; j < i; j++)  
          imprimeAluno(alunos[j]);
    }
  }
}


