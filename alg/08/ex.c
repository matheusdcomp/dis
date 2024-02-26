
1) Crie o registro pessoa com nome (ponteiro para char) e idade (int). Crie uma função que recebe um ponteiro para pessoa e imprime os dados dessa pessoa. Crie um função main que solicita os dados de duas pessoas e as armazena em variáveis dinâmicas da heap. Por fim, imprima os dados de cada pessoa usando a função anterior.

typedef struct { 
  char* nome;
  int idade;
} Pessoa;

2) Fazer um programa que solicita quantos nomes o usuário quer
digitar e aloque dinâmicamente um array de char com o tamanho informado. Depois solicite que o usuário digite os nomes e aramazene cada um usando alocação dinâmica e ponteiro para char. Ao final, imprima cada nome digitado em uma linha.