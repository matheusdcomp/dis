package clp.tp.ui;

import java.util.Scanner;

public abstract class MenuEntidade extends MenuAbstrato {

  protected abstract void listar();

  protected abstract void adicionar(Scanner scanner);

  protected abstract void remover(Scanner scanner);

  @Override
  protected void executarOpcao(int opcao, Scanner scanner) {

    switch (opcao) {
      case 0:
        return;

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
  }

  @Override
  protected void mostrarOpcoes() {
    System.out.println(String.format(
        "%s\n%s\n%s\n%s\n",
        "0 -> VOLTAR\n",
        "1 -> LISTAR\n",
        "2 -> ADICIONAR\n",
        "3 -> REMOVER\n"));
  }

}
