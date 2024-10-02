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
  protected void executarOpcao(int opcao, Scanner scanner) {

    switch (opcao) {
      case 0:
        return;

      case 1:
        menuProduto.mostrarMenu(scanner);
        break;

      case 2:
        menuVenda.mostrarMenu(scanner);
        break;

      default:
        System.err.println("OPCAO INVALIDA\n");
    }
  }

  @Override
  protected void mostrarOpcoes() {
    System.out.println(String.format(
        "%s\n%s\n%s\n",
        "0 -> FECHAR PROGRAMA\n",
        "1 -> PRODUTO\n",
        "2 -> VENDA\n"));
  }

  @Override
  protected void mostrarTitulo() {
    System.out.println("MENU PRINCIPAL");
  }

}