package clp.tp;

import java.util.Scanner;

import clp.tp.ui.MenuPrincipal;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    scanner.useDelimiter("\\R");

    new MenuPrincipal().mostrarMenu(scanner);

    scanner.close();
  }

}