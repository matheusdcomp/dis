package clp.tp.ui;

import clp.tp.entidades.Venda;
import clp.tp.entidades.Produto;

import java.util.Scanner;

import clp.tp.data.DAOProduto;
import clp.tp.data.DAOVenda;

public class MenuVenda extends MenuEntidade {

  private DAOVenda daoVenda;
  private DAOProduto daoProduto;

  public MenuVenda() {
    super();
    daoVenda = DAOVenda.getInstance();
    daoProduto = DAOProduto.getInstance();
  }

  @Override
  protected void mostrarTitulo() {
    System.out.println("MENU VENDAS");
  }

  @Override
  protected void listar() {
    System.out.println(daoVenda.toString());
  }

  @Override
  protected void adicionar(Scanner scanner) {

    Venda venda = new Venda();
    Produto produto = null;
    String nome = null;
    int qtd = 0;

    while (true) {

      while (nome == null || nome.equals("") || qtd <= 0) {

        try {
          System.out.print("\nDigite o nome do produto: ");
          produto = daoProduto.buscar(scanner.nextLine());
          System.out.print("Digite a quantidade: ");
          qtd = scanner.nextInt();
        } catch (Exception ex) {
          System.err.println("\nFavor informar os dados corretamente.\n");
        }
      }

      venda.adicionarItem(produto, qtd);

      System.out.print("\nDeseja adicionar outro produto à venda (1-SIM/0-NAO)?");
      if (scanner.nextInt() != 1)
        break;
    }

    daoVenda.adicionar(venda);
  }

  @Override
  protected void remover(Scanner scanner) {

    long id = 0;

    while (id <= 0.0) {
      try {
        System.out.print("\nDigite o id: ");
        id = scanner.nextLong();
      } catch (Exception ex) {
        System.err.println("\nFavor informar os dados corretamente.\n");
      }
    }
    daoVenda.remover(id);
  }

}
