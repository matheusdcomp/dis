package clp.tp.ui;

import java.util.Scanner;

public abstract class MenuEntidade extends MenuAbstrato {

  protected abstract void listar();

  protected abstract void adicionar(Scanner scanner);

  protected abstract void remover(Scanner scanner);

  @Override
  protected int executarOpcao(int opcao, Scanner scanner) {

    switch (opcao) {
      case 0:
        return 0;

      case 1:
        listar();
        break;

      case 2:
        adicionar(scanner);
        break;

      case 3:
        remover(scanner);
        break;

      default:
        System.err.println("OPCAO INVALIDA\n");
    }

    return 1;
  }

  @Override
  protected void mostrarOpcoes() {
    System.out.println(String.format(
        "%s\n%s\n%s\n%s",
        "0 -> VOLTAR",
        "1 -> LISTAR",
        "2 -> ADICIONAR",
        "3 -> REMOVER"));
  }

}
