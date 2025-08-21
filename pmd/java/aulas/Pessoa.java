package aulas;

import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa {

  public static int fatorial(int n) {
    if (n <= 1)
      return 1;
    return n * fatorial(n - 1);
  }

  public static void main(String[] args) {

    int idade = 0;
    String nome = null;

    var sc = new Scanner(System.in);
    while (idade == 0) {
      System.out.print("Digite a idade da pessoa: ");
      idade = sc.nextInt();

      System.out.print("Digite o nome da pessoa: ");
      nome = sc.next();
    }
    if (idade != 0) {
      System.out.println("\nNome: " + nome + "\tIdade: " + idade);
    } else {
      System.out.println("Nome vazio.");
    }
    sc.close();

    var v = new ArrayList<Integer>();
    v.add(1);
    v.add(5);
    v.add(10);

    for (int x : v) {
      System.out.printf("\nFatorial de %d: %d", x, fatorial(x));
    }

  }

}
