//a ordenacao tem que ser feita no mesmo array, senao nao funciona

#include<stdio.h>
#include<string.h>

void main() {

    char nomes[5][20], aux[20];
    int m;

    for (int i = 0; i < 5; i++) {
        printf("Digite uma palavra: ");
        scanf("%s", &nomes[i]);
    }

    for (int j = 0; j < 4; j++) {

        m = j; //inicialmente considera q o menor esta em j

        for (int i = j+1; i < 5; i++)
            if (strcmp(nomes[i], nomes[m]) < 0)//se quem esta em i eh menor do q quem esta em j
                m = i;//quem esta em i passa a ser o menor

        if (m != j) {//se o menor nao estava em j, o menor vai para j e quem estava em j vai para onde estava o menor              
            strcpy(aux, nomes[j]);
            strcpy(nomes[j], nomes[m]);
            strcpy(nomes[m], aux);
        }

    }

    printf("\nNomes em ordem alfabetica:\n");
    for (int i = 0; i < 5; i++)
        printf("%s\n", nomes[i]); 
            
}