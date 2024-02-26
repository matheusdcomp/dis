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
ESTA VERSAO NAO GRAVA OS NOMES DOS ATRIBUTOS NO ARQUIVO, SOMENTE OS VALORES.
NESTA VERSAO GRAVEI TODOS OS ATRIBUTOS DE CADA PESSOA EM UMA UNICA LINHA SEPRADOS POR TAB (\t)
POR CAUSA DISSO, NAO PODE DIGITAR O NOME DA PESSOA COM ESPACO, POIS O FPRINTF CONFUNDE O ESPACO COM O \t
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
    FILE* arq = fopen("pessoasv2.txt", "w");
    while(atual != NULL) {
        fprintf(arq, "%s\t%d\t%f\n",//grava somente os valores dos atributos no arquivo 
            atual->pes->nome, atual->pes->idade, atual->pes->altura);//em cada linha
        atual = atual->prox;
    }
    fclose(arq);
}

listap* carregaPessoas() {//esta versão não precisa da variável str 
    FILE* arq = fopen("pessoasv2.txt", "r");
    pessoa* p;
    listap* pessoas = NULL;
    while(!feof(arq)) {
        p = (pessoa*) malloc(sizeof(pessoa));
        p->nome = (char*) malloc(sizeof(char));
        fscanf(arq, "%s\t%d\t%f\n", p->nome, &p->idade, &p->altura);//lê da mesma forma que escreveu. Note que o a string é igual ao do fprintf na funcao gravaPessoa
        pessoas = addPessoa(pessoas, p);
    }
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