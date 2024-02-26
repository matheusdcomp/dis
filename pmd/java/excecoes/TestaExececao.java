package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestaExececao {

  public static void fun() throws InputMismatchException, ArithmeticException {
    System.out.println("\nINICIO DO PROGRAMA");
    Scanner sc = new Scanner(System.in);
    int a, b;

    System.out.println("Digite dois inteiros: ");
    a = sc.nextInt();
    b = sc.nextInt();
    System.out.println(a + " / " + b + " = " + a / b);
    sc.close();
  }

  public static void main(String[] args) {
    boolean ok = false;
    while (!ok) {
      try {
        fun();
        ok = true;
      } catch (InputMismatchException e) {
        System.err.println("Você não digitou um inteiro.");
        ok = false;
      } catch (ArithmeticException e) {
        System.err.println(e.getMessage());
        ok = false;
      }
      System.out.println("\nFIM DO PROGRAMA");

    }
  }

}
