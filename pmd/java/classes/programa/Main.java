/*
  Criar um menu que permite o usuário escolher sair do programa, cadastrar um produto ou realizar uma venda.
  O usuário pode repetir isso quantas vezes quiser até escolher sair.
  Ao realizar a venda, o usuário deve poder escolher os produtos.
*/

package classes.programa;

import classes.Venda;
import classes.Produto;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<Produto> produtos = new ArrayList<>();
    int op;

    while (true) {

      System.out.printf(
          "\n\n%s\n%s\n%s\n%s",
          "0 - SAIR",
          "1 - CADASTRAR PRODUTO",
          "2 - REALIZAR VENDA",
          "Informe a sua opção: ");

      op = sc.nextInt();

      switch (op) {

        case 0:
          sc.close();
          return;

        case 1:
          System.out.print("\nInforme o nome e o valor do produto: ");
          produtos.add(new Produto(sc.next(), sc.nextFloat()));
          break;

        case 2:
          Venda venda = new Venda();
          venda.setNumero((int) Math.random());
          do {
            System.out.print("\nInforme o nome do produto: ");
            String np = sc.next();
            for (Produto p : produtos) {
              if (p.getNome().equals(np)) {
                venda.addProduto(p);
                break;
              }
            }
            System.out.print("\nDeseja comprar outro produto (0-Não/1-Sim)? ");
          } while (sc.nextInt() != 0);
          venda.imprimir();
      }
    }
  }

}
