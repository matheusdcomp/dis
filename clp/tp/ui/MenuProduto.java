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

    while (true) {

      try {

        System.out.print("\nDigite o nome: ");
        nome = scanner.next();

        System.out.print("Digite o valor: ");
        valor = scanner.nextDouble();

        if (nome == null || nome.equals("") || valor <= 0.0)
          throw new Exception("\nFavor informar os dados corretamente.\n");
        else
          break;

      } catch (Exception ex) {
        System.err.println(ex.getMessage());
      }
    }

    dao.adicionar(new Produto(nome, valor));
  }

  @Override
  protected void remover(Scanner scanner) {

    String nome = null;

    while (true) {

      try {

        System.out.print("\nDigite o nome: ");
        nome = scanner.next();

        if (nome == null || nome.equals(""))
          throw new Exception("\nFavor informar o nome corretamente.\n");
        else
          break;

      } catch (Exception ex) {
        System.err.println(ex.getMessage());
      }
    }

    dao.remover(nome);
  }

}
