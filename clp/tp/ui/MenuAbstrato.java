package clp.tp.ui;

import java.util.Scanner;

public abstract class MenuAbstrato {

  public void mostrarMenu(Scanner scanner) {

    System.out.println("\n\n\n");

    mostrarTitulo();

    mostrarOpcoes();

    System.out.print("INFORME A SUA OPCAO: ");

    executarOpcao(scanner.nextInt(), scanner);
  }

  protected abstract void executarOpcao(int opcao, Scanner scanner);

  protected abstract void mostrarOpcoes();

  protected abstract void mostrarTitulo();

}
