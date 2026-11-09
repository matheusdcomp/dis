#include<stdio.h>

typedef enum { CREDITO, DEBITO } TipoTransacao;

typedef struct { 
  float valor; 
  TipoTransacao tipo; 
} Transacao;

typedef struct {
  int numero;
  char titular[50];
  Transacao transacoes[100];
  int qt;
} Conta;


float obterSaldo(Conta c) {
  float saldo = 0;
  for (int i = 0; i < c.qt; i++) {
    saldo += (c.transacoes[i].tipo == CREDITO) ?
      c.transacoes[i].valor : 
      -c.transacoes[i].valor;
  }
  return saldo;
}

float obterSaldoR(Conta c) {
  if (c.qt == 0) 
    return 0;
  if (c.transacoes[c.qt-1].tipo == CREDITO) {
    c.qt--;
    return obterSaldoR(c) + c.transacoes[c.qt].valor;
  }
  else {
    c.qt--;
    return obterSaldoR(c) - c.transacoes[c.qt].valor;
  }
}


float obterSaldoR2aux(Conta c, int i) {

  if (c.qt == i) 
    return 0;

  if (c.transacoes[i].tipo == CREDITO)
    return obterSaldoR2aux(c, i+1) + c.transacoes[i].valor;

  return obterSaldoR2aux(c, i+1) - c.transacoes[i].valor;
}

float obterSaldoR2(Conta c) {
  return obterSaldoR2aux(c, 0);
}


void printConta(Conta c) {
  printf("\nNro: %d\nTitular: %s\nSaldo: %.2f", 
    c.numero, c.titular, obterSaldo(c));
}

int status(Conta c) {
  return obterSaldo(c) >= 0;
}

void devedores(Conta c[], int t) {
  for (int i = 0; i < t; i++)
    if (!status(c[i]))
      printConta(c[i]);
}

void devedoresR(Conta c[], int t) {
  if (t <= 0) return;
  if (!status(c[t-1]))
    printConta(c[t-1]);
  devedores(c, t-1);
}



void main() {
  const int T = 2;
  Conta contas[T];
  for (int i = 0; i < T; i++) {
    contas[i].numero = i+1;
    printf("\nDigite o titular da conta: ");
    scanf("%s", contas[i].titular);
    int qt = 0;
    char op, tp;
    do {
      printf("Digite o valor da transacao: ");
      scanf("%f", &contas[i].transacoes[qt].valor);
      printf("Digite o tipo da transacao (c ou d): ");
      scanf(" %c", &tp);
      contas[i].transacoes[qt].tipo = tp == 'c' ? CREDITO : DEBITO;
      qt++;
      printf("Deseja cadastrar outra transacao (s/n): ");
      scanf(" %c", &op);
    } while (op != 'n');
    contas[i].qt = qt;
  }

  for (int i = 0; i < T; i++) {
    printConta(contas[i]);
    for (int j = 0; j < contas[i].qt; j++) {
      printf("\n  Valor da transacao: %.2f", contas[i].transacoes[j].valor);
      printf("\n  Tipo: %d", contas[i].transacoes[j].tipo);
    }
  }
  
  printf("\n\nDEVEDORES:");
  devedores(contas,T);

}