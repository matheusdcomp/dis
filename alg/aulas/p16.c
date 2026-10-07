#include<stdio.h>

void main() {
  const int T = 4;
  int op, i = 0, p;

  float notas[] = {-1,-1,-1,-1};
  while (1) { 
    
    printf("\n0 SAIR\n1 CADASTRAR NOTA\n2 VER TODAS NOTAS\n3 VER UMA NOTA");
    printf("\nDigite sua opcao: ");
    scanf("%d", &op);

    switch(op) {
      case 0: 
        return;
      case 1:
        if (i == T) {
          printf("\nTodas as notas foram cadastradas.\n");
          break;
        }
        printf("Digite a nota %d do aluno: ", i+1);
        scanf("%f", &notas[i]);
        i++;
        break;
      case 2: 
        for (int j = 0; j < T; j++) {
          printf("Nota %d: %.1f\n", j+1, notas[j]);
        }
        break;
      case 3: 
        printf("Informe o indice da nota que quer ver: ");
        scanf("%d", &p);
        if (notas[p-1] == -1) {
          printf("\nA nota %d ainda nao foi cadastrada.\n", p);
          break;
        }
        printf("Nota %d: %.1f\n", p, notas[p-1]);
    }
  }

  

}