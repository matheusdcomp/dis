package clp.tp.ui;

import java.util.Scanner;

public class MenuPrincipal extends MenuAbstrato {

  private MenuProduto menuProduto;
  private MenuVenda menuVenda;

  public MenuPrincipal() {
    super();
    menuProduto = new MenuProduto();
    menuVenda = new MenuVenda();
  }

  @Override
  protected int executarOpcao(int opcao, Scanner scanner) {

    switch (opcao) {
      case 0:
        return 0;

      case 1:
        menuProduto.mostrarMenu(scanner);
        break;

      case 2:
        menuVenda.mostrarMenu(scanner);
        break;

      default:
        System.err.println("OPCAO INVALIDA\n");
    }

    return 1;
  }

  @Override
  protected void mostrarOpcoes() {
    System.out.println(String.format(
        "%s\n%s\n%s",
        "0 -> FECHAR PROGRAMA",
        "1 -> PRODUTO",
        "2 -> VENDA"));
  }

  @Override
  protected void mostrarTitulo() {
    System.out.println("MENU PRINCIPAL");
  }

}