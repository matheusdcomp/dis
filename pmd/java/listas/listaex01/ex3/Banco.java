package listas.listaex01.ex3;

import listaex01.ex2.Conta;

public class Banco {

  private Conta[] contas;
  private int qtdContas;

  public Banco() {
    contas = new Conta[10];
    qtdContas = 0;
  }

  public Conta[] getContas() {
    return contas;
  }

  public void cadastrarConta(Conta conta) {
    contas[qtdContas++] = conta;
  }

}