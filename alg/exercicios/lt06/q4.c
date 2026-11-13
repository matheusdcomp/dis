/*
Crie um registro Acessorio com nome e valor. Crie um registro 
Carro com nome, valor e um array de acessórios. Implemente um 
programa que permite o usuário configurar diversos carros até 
escolher sair. Para cada carro, o usuário informa o nome e 
os acessórios(nome e valor de cada um, podendo ser quantos o 
usuário quiser, respeitando o limite do array). Após  o  
cadastro  de  um carro,  o  programa imprime os  dados  dele, 
dos acessórios incluídos e o valor total (soma do valor do 
carro com osvalores dos acessóriosincluídos nele).
*/

#include<stdio.h>

typedef struct {
    char nome[50];
    float valor;
} Acessorio;

typedef struct {
    char nome[50];
    float valor;
    Acessorio acessorios[10];
} Carro;

void main() {

    Carro carros[10];
    int op, ac, sair = 0, qc = 0, qa;
    float total; 

    while(!sair) {

        printf("\n\n0 SAIR\n1 Cadastrar Carro");
        printf("\nDigite sua opcao: ");
        scanf("%d", &op);
        ac = 1;

        switch (op) {

            case 0:
                sair = 1; 
                break;

            case 1:
                printf("\nDigite o nome do carro: ");
                scanf(" %s", carros[qc].nome);
                printf("\nDigite o valor do carro: ");
                scanf("%f", &carros[qc].valor);
                qa = 0;

                while(ac && qa < 10) {

                    printf("\n\n0 Voltar\n1 Add acessorio");
                    printf("\nDigite sua opcao: ");
                    scanf("%d", &ac);

                    if (ac) {
                        printf("\nDigite o nome do acessorio: ");
                        scanf(" %s", carros[qc].acessorios[qa].nome);
                        printf("\nDigite o valor do acessorio: ");
                        scanf("%f", &carros[qc].acessorios[qa].valor);
                        qa++;
                    }                    

                }
                total = carros[qc].valor;
                printf("\nNome do carro: %s", carros[qc].nome); 
                printf("\nValor do carro: %.2f", carros[qc].valor); 
                printf("\nAcessorios:");
                for (int i = 0; i < qa; i++) {
                    printf("\n\tNome: %s", carros[qc].acessorios[i].nome); 
                    printf("\tValor: %.2f", carros[qc].acessorios[i].valor);
                    total += carros[qc].acessorios[i].valor;
                } 
                printf("\nTotal: %.2f", total);
                qc++;             

        }


    }
    
}