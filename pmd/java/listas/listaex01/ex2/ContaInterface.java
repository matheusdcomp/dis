package listas.listaex01.ex2;

import java.util.Scanner;

public class ContaInterface {

  public static void menu(Conta conta, Scanner scn) {

    while (true) {

      System.out.print(
          "\n0 - SAIR" +
              "\n1 - DEPOSITAR" +
              "\n2 - SACAR" +
              "\n3 - VER SALDO" +
              "\nINFORME A SUA OPÇÃO: ");

      int op = scn.nextInt();

      switch (op) {

        case 0:
          return;

        case 1:
          System.out.print("\nINFORME O VALOR DO DEPOSITO: ");
          conta.setSaldo(conta.getSaldo() + scn.nextDouble());
          break;

        case 2:
          System.out.print("\nINFORME O VALOR DO SAQUE: ");
          conta.setSaldo(conta.getSaldo() - scn.nextDouble());
          break;

        case 3:
          System.out.println("\nSALDO ATUAL: " + conta.getSaldo());
      }
    }
  }

}