package listas.listaex02.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contas {

  public static void menuBanco(Scanner scn) {

    List<ContaBancaria> contas = new ArrayList<>();

    while (true) {

      System.out.print(
          "\n0 - SAIR" +
              "\n1 - ABRIR CONTA" +
              "\n2 - SELECIONAR CONTA" +
              "\nINFORME A SUA OPÇÃO: ");

      int op = scn.nextInt();

      switch (op) {

        case 0:
          return;

        case 1:
          System.out.print("\nINFORME O TIPO DE CONTA (1 - POUPANCA; 2 - ESPECIAL): ");
          int tipoConta = scn.nextInt();
          System.out.print("\nINFORME O NOME DO CLIENTE: ");
          String cliente = scn.next();
          System.out.print("\nINFORME O SALDO INICIAL: ");
          float saldo = scn.nextFloat();

          if (tipoConta == 1) {
            System.out.print("\nINFORME A TAXA DE RENDIMENTO: ");
            float rendimento = scn.nextFloat();
            contas.add(new ContaPoupanca(cliente, contas.size() + 1, saldo, rendimento));
          } else {
            System.out.print("\nINFORME O LIMITE: ");
            float limite = scn.nextFloat();
            contas.add(new ContaEspecial(cliente, contas.size() + 1, saldo, limite));
          }
          // o numero da conta é a posição na lista contas mais um
          break;

        case 2:
          System.out.printf("\nINFORME O NUMERO DA CONTA (1 - %d): ", contas.size());
          menuConta(scn, contas.get(scn.nextInt()));
      }
    }
  }

  public static void menuConta(Scanner scn, ContaBancaria conta) {

    while (true) {

      System.out.print(
          "\n0 - VOLTAR" +
              "\n1 - DEPOSITAR" +
              "\n2 - SACAR" +
              "\n3 - VER CONTA" +
              "\nINFORME A SUA OPÇÃO: ");

      int op = scn.nextInt();

      switch (op) {

        case 0:
          return;

        case 1:
          System.out.print("\nINFORME O VALOR DO DEPOSITO: ");
          conta.depositar(scn.nextFloat());
          break;

        case 2:
          System.out.print("\nINFORME O VALOR DO SAQUE: ");
          if (!conta.sacar(scn.nextFloat()))
            System.out.println("\nSAQUE NÃO REALIZADO: SALDO INSUFICIENTE.");
          break;

        case 3:
          System.out.println(conta.toString());
      }
    }
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    menuBanco(scn);
    scn.close();
  }
}