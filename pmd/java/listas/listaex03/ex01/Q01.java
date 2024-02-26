package listas.listaex03.ex01;

import java.util.Scanner;

public class Q01 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Digite duas strings:");
    String a = s.nextLine();
    String b = s.nextLine();
    try {
      if (a.compareTo(b) == 0)
        System.out.println("As strings são iguais.");
      else if (a.compareTo(b) < 0)
        System.out.printf("'%s' vem antes de '%s'.\n", a, b);
      else if (b.compareTo(a) < 0)
        System.out.printf("'%s' vem antes de '%s'.\n", b, a);
    } catch (NullPointerException e) {
      System.err.println("Você digitou uma string vazia.");
      e.printStackTrace();
    }
    s.close();
  }

}
