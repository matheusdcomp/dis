package listas.listaex01.ex3;

import java.util.Scanner;
import listaex01.ex2.Conta;
import listaex01.ex2.ContaInterface;

public class BancoInterface {

  private Banco banco;

  public BancoInterface(Banco banco) {
    this.banco = banco;
  }

  public void menu(Scanner scn) {
    while (true) {

      System.out.print(
          "\n0 - SAIR\n1 - ABRIR CONTA\n2 - ACESSAR CONTA\nINFORME A SUA OPÇÃO: ");
      int op = scn.nextInt();

      switch (op) {

        case 0:
          return;

        case 1:
          System.out.print("\nDigite o número e o saldo da conta: ");
          Conta conta = new Conta(scn.nextInt(), scn.nextDouble());
          banco.cadastrarConta(conta);
          break;

        case 2:
          System.out.println("\nINFORME O NÚMERO DA CONTA: ");
          int numero = scn.nextInt();
          for (Conta c : banco.getContas()) {
            if (c.getNumero() == numero) {
              ContaInterface.menu(c, scn);
              break;
            }
          }
      }
    }
  }
}