package clp.tp.ui;

import clp.tp.entidades.Produto;

import java.util.Scanner;

import clp.tp.data.DAOProduto;

public class MenuProduto extends MenuEntidade {

  private DAOProduto dao;

  public MenuProduto() {
    super();
    dao = DAOProduto.getInstance();
  }

  @Override
  protected void mostrarTitulo() {
    System.out.println("MENU PRODUTOS");
  }

  @Override
  protected void listar() {
    System.out.println(dao.toString());
  }

  @Override
  protected void adicionar(Scanner scanner) {

    String nome = null;
    double valor = 0.0;

    while (nome == null || nome.equals("") || valor <= 0.0) {
      try {
        System.out.print("\nDigite o nome: ");
        nome = scanner.nextLine();
        System.out.print("Digite o valor: ");
        valor = scanner.nextDouble();
      } catch (Exception ex) {
        System.err.println("\nFavor informar os dados corretamente.\n");
      }
    }

    dao.adicionar(new Produto(nome, valor));
  }

  @Override
  protected void remover(Scanner scanner) {

    String nome = null;

    while (nome == null || nome.equals("")) {
      try {
        System.out.print("\nDigite o nome: ");
        nome = scanner.nextLine();
      } catch (Exception ex) {
        System.err.println("\nFavor informar os dados corretamente.\n");
      }
    }

    dao.remover(nome);
  }

}
