package listas.listaex03.ex03;

import java.util.Scanner;

public class Main {

  public static int fatorial(int n) throws NegativeNumberException {
    if (n < 0)
      throw new NegativeNumberException(n);
    int fat = 1;
    for (int i = 2; i <= n; i++)
      fat *= i;
    return fat;
  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    try {
      System.out.print("Digite um inteiro: ");
      String str = scan.nextLine();
      scan.close();

      if (str == null || str.equals(""))
        throw new StringVaziaException();

      int n = Integer.parseInt(str);

      System.out.printf("\nFatorial de %d: %d", n, fatorial(n));
    } catch (StringVaziaException e) {
      System.out.println(e.getMessage());
    } catch (NegativeNumberException e) {
      System.out.println(e.getMessage());
    } catch (NumberFormatException e) {
      e.printStackTrace();
    }

  }

}
