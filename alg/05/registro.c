#include<stdio.h>
#include<string.h>

struct Pessoa {
    char nome[50];
    int idade;
    float altura;
};

void main() {
    
    struct Pessoa p1, p2;
    
    printf("Digite a idade da pessoa 1: ");
    scanf("%d", &p1.idade);
    printf("Digite a altura da pessoa 1: ");
    scanf("%f", &p1.altura);
    printf("Digite o nome da pessoa 1: ");
    scanf("%s", p1.nome);
    
    printf("Digite a idade da pessoa 2: ");
    scanf("%d", &p2.idade);
    printf("Digite a altura da pessoa 2: ");
    scanf("%f", &p2.altura);
    printf("Digite o nome da pessoa 2: ");
    scanf("%s", p2.nome);
    
    printf("\nPessoa 1");
    printf("\nNome: %s", p1.nome);
    printf("\nIdade: %d", p1.idade);
    printf("\naltura: %.2f", p1.altura);

    printf("\nPessoa 2");
    printf("\nNome: %s", p2.nome);
    printf("\nIdade: %d", p2.idade);
    printf("\naltura: %.2f", p2.altura);

}