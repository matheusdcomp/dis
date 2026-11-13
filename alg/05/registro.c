#include<stdio.h>

typedef struct  {
    char nome[50];
    int idade;
    float altura;
} pessoa;

void main() {
    
    pessoa p[2];
    
    printf("Digite a idade da pessoa 1: ");
    scanf("%d", &p[0].idade);
    printf("Digite a altura da pessoa 1: ");
    scanf("%f", &p[0].altura);
    printf("Digite o nome da pessoa 1: ");
    scanf("%s", p[0].nome);
    
    printf("Digite a idade da pessoa 2: ");
    scanf("%d", &p[1].idade);
    printf("Digite a altura da pessoa 2: ");
    scanf("%f", &p[1].altura);
    printf("Digite o nome da pessoa 2: ");
    scanf("%s", p[1].nome);
    
    printf("\nPessoa 1");
    printf("\nNome: %s", p[0].nome);
    printf("\nIdade: %d", p[0].idade);
    printf("\naltura: %.2f", p[0].altura);

    printf("\nPessoa 2");
    printf("\nNome: %s", p[1].nome);
    printf("\nIdade: %d", p[1].idade);
    printf("\naltura: %.2f", p[1].altura);

}