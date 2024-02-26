#include<stdio.h>
#include<stdlib.h>
#include<string.h>

/*
Este programa permite cadastrar pessoas em uma lista e imprimir os seus dados.
Quando o programa liga, carrega do arquivos as pessoas do arquivo pessoas.txt 
e as insere em uma lista.
Durante a execução, cada pessoa cadastrada é inserida no início da lista.
Quando o usuário escolhe sair do programa, todas as pessoas da lista são 
gravadas de volta no arquivo. Note que o conteúdo anterior do arquivo é apagado e 
todas as pessoas da lista são gravadas.
*/

typedef struct {
    char* nome;
    int idade;
    float altura;
} pessoa;

struct listapessoa {
    pessoa* pes;
    struct listapessoa* prox;
};
typedef struct listapessoa listap;

pessoa* cadPessoa() {
    pessoa *p = (pessoa*) malloc(sizeof(pessoa)); 
    p->nome = (char*) malloc(sizeof(char)*50);
    printf("\nDigite o nome: ");
    gets(p->nome);
    fflush(stdin);
    printf("Digite idade: ");
    scanf("%d", &p->idade);
    fflush(stdin);
    printf("Digite a altura: ");
    scanf("%f", &p->altura);
    fflush(stdin);
    return p;
}

int qtdPessoas(listap* pessoas) {
    int qtd = 0;
    listap* atual = pessoas;
    while(atual != NULL) {
        qtd++;
        atual = atual->prox;
    }
    return qtd;
}

listap* addPessoa(listap* pessoas, pessoa* p) {
    listap* lp = (listap*) malloc(sizeof(listap));
    lp->pes = p;
    lp->prox = pessoas;
    pessoas = lp;
    return pessoas;
}

void imprimirPessoas(listap* pessoas) {
    listap* atual = pessoas;
    while(atual != NULL) {
        printf("\nNome: %s\tIdade: %d\tAltura: %.2f",
            atual->pes->nome, atual->pes->idade, atual->pes->altura);
        atual = atual->prox;
    }
}

void gravaPessoas(listap* pessoas) {
    listap* atual = pessoas;
    FILE* arq = fopen("pessoas.txt", "w");
    while(atual != NULL) {
        fprintf(arq, "Nome: %s\nIdade: %d\nAltura: %f\n",//grava o nome do atributo e o valor 
            atual->pes->nome, atual->pes->idade, atual->pes->altura);//em cada linha
        atual = atual->prox;
    }
    fclose(arq);
}

listap* carregaPessoas() {    
    FILE* arq = fopen("pessoas.txt", "r");
    pessoa* p;
    listap* pessoas = NULL;
    char* str = (char*) malloc(sizeof(char)*10);//para pegar as strings antes de cada valor
    while(!feof(arq)) {
        p = (pessoa*) malloc(sizeof(pessoa));
        p->nome = (char*) malloc(sizeof(char));
        fscanf(arq, "%s %s\n", str, p->nome); 
        fscanf(arq, "%s %d\n", str, &p->idade);//cada fscanf lê o nome do atributo e o valor
        fscanf(arq, "%s %f\n", str, &p->altura);//fiz um fscanf para cada atributo
        //fscanf(arq, "%s %s\n%s %d\n%s %f\n", str, p->nome, str, &p->idade, str, &p->altura);//para carregar todos atributos de uma vez só seria assim
        pessoas = addPessoa(pessoas, p);
    }
    free(str);//apaga a variável apontada por str, pois não vai usar mais. As outras continuam, pois vão ser usadas nas outras funções.
    fclose(arq);
    return pessoas;
}


void main() {

    listap* pessoas = carregaPessoas();
    int op;
    pessoa* p;
    listap* lp;

    while(1) {

        printf("\n\n0 sair\n1 Cadastrar\n2 Imprimir\nDigite a opcao: ");
        scanf("%d", &op);
        fflush(stdin);
        
        if (op == 0) {
            gravaPessoas(pessoas);
            return;
        }

        else if (op == 1) {
            p = cadPessoa();
            pessoas = addPessoa(pessoas, p);
        }

        else if (op == 2) {
            imprimirPessoas(pessoas);
        }

    }

}