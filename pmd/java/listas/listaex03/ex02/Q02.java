package listas.listaex03.ex02;

import java.util.Scanner;

public class Q02 {

  public static void main(String[] args) {
    int v[] = new int[10];
    Scanner s = new Scanner(System.in);
    System.out.print("Digite um inteiro: ");
    int a = s.nextInt();
    s.close();
    int i = 0;
    try {
      for (int d = 1; d <= a; d++)
        if (a % d == 0)
          v[i++] = d;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Atingiu o limite do array, mas haveria outros divisores.");
    } finally {
      for (int d = 0; d < i - 1; d++)
        System.out.print(v[d] + " ");
    }
  }

}
