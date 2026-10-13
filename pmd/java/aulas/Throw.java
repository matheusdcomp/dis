package aulas;

import java.util.Scanner;

public class Throw {
  public static void teste() {
    Scanner s = new Scanner(System.in);
    System.out.print("Digite um inteiro: ");
    String str = s.next();
    int a;
    try {
      for (char c : str.toCharArray())
        if (!Character.isDigit(c))
          throw new NumberFormatException();
    } catch (NumberFormatException e) {
      e.printStackTrace();
    }
    a = Integer.parseInt(str);
  }
}
