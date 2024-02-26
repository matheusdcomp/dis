package excecoes;

import java.util.Scanner;

public class TesteMinhaExcecao {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      String a;
      System.out.println("Digite uma string: ");
      a = sc.next();
      if (a.equals("sim"))
        throw new MinhaExcecao();
    } catch (MinhaExcecao e) {
      e.printStackTrace();
    }
    System.out.println("\nFIM");
    sc.close();
  }
}
