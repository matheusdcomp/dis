/*
Crie um registro Produto que contém nome (string) e 
valor (float). Crie uma função recursiva que recebe 
um array de produtos e o tamanho desse array e retorna 
a soma dos valores deles. Crie uma função recursiva que
recebe um array de produtos e o tamanho desse array e 
retorna o produto mais barato. Crie uma função recursiva 
que recebe um array de produtos e o tamanho desse array 
e imprime os dados de todos os produtos desse array. 
Crie uma função main com um menu que permite ao usuário 
entrar em um laço que ele pode escolher sair do programa, 
cadastrar um produto, imprimir os dados de todos os produtos, 
imprimir os dados do produto mais barato ou imprimir a 
soma do valor de todos os produtos.
*/

#include<stdio.h>
#include<string.h>

typedef struct {
    char nome[50];
    float valor;
} produto;

float somaValores(produto[], int);
produto maisBarato(produto[], int);
produto maisBaratoAux(produto[], int, int);
void imprimeTodos(produto[], int);
void imprime(produto);
void main();

float somaValores(produto ps[], int t) {
    if (t <= 0) return 0;
    return ps[t-1].valor + somaValores(ps, t-1);
}

produto maisBarato(produto ps[], int t){
    return maisBaratoAux(ps, t, t-1);
}
produto maisBaratoAux(produto ps[], int t, int imb){
    if (t <= 0) return ps[imb];
    if (ps[t-1].valor < ps[imb].valor) imb = t-1;
    return maisBaratoAux(ps, t-1, imb);
}

void imprimeTodos(produto ps[], int t) {
    if (t <= 0) return;
    imprime(ps[t-1]);
    imprimeTodos(ps, t-1);    
}

void imprime(produto p) {
    printf("\nNome: %s\nValor: %.2f\n", p.nome, p.valor);
}


void main() {
    produto produtos[50];
    int op, q = 0;
    while(1) {
        printf("\n0 - Sair");
        printf("\n1 - Cadastrar produto");
        printf("\n2 - Imprimir todos os produtos");
        printf("\n3 - Ver o produto mais barato");
        printf("\nDigite sua opcao: ");
        scanf("%d", &op);
        if (op == 0) {
            break;
        }
        else if (op == 1) {
            printf("Digite o nome do produto: ");
            fflush(stdin);
            gets(produtos[q].nome);
            printf("Digite o valor do produto: ");
            scanf("%f",&produtos[q].valor);
            q++;            
        }
        else if (op == 2) {
            imprimeTodos(produtos, q);          
        }
        else if (op == 3) {
            imprime(maisBarato(produtos, q));          
        }
        else {
            printf("\nopcao invalida!\n");
        }
    }
}