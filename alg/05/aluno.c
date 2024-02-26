#include<stdio.h>

typedef struct{
    int cpf;
    char nome[50];
} pessoa;

typedef struct {
    pessoa pes;
    float notas[3];
} aluno;

void main() {

    aluno alunos[2];
    float medias[2];

    for (int a = 0; a < 2; a++) {

        printf("\nDigite o cpf do %do aluno: ", a+1);
        scanf("%d", &alunos[a].pes.cpf );
        printf("Digite o nome do %do aluno: ", a+1);
        scanf("%s", alunos[a].pes.nome );

        for (int n = 0; n < 3; n++) {   
            printf("Digite a %da nota do %do aluno: ", n+1, a+1);
            scanf("%f", &alunos[a].notas[n] );
            medias[a] += alunos[a].notas[n];
        }

    }

    for (int a = 0; a < 2; a++)
        printf("\nMedia do %do aluno: %.1f\n", a+1, medias[a]/3);


}