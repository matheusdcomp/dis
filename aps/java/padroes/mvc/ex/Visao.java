package mvc.ex;

import java.util.Scanner;

public class Visao implements Observer {

  private Controller controller;
  private Scanner scan = new Scanner(System.in);

  public Visao(Controller controller) {
    this.controller = controller;
  }

  public void update(int id) {
    System.out.print("\n\nId: " + id + "\n\n");
  }

  public void rodar() {
    while (menu() == 1)
      clicar();
    sair();
  }

  public int menu() {
    System.out.println("\n\n0 - Sair\n1 - Clicar");
    System.out.print("Sua opcao: ");
    return scan.nextInt();
  }

  public void clicar() {
    controller.clicar();
  }

  public void sair() {
    scan.close();
  }

}