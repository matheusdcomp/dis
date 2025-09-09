package aulas;

import java.util.Scanner;

public class CalculadoraMain {
  public static void main(String[] args) {

    Calculadora c = new Calculadora();
    int opcao;
    Scanner scanner = new Scanner(System.in);

    while (true) {

      System.out.print("\n\n0 SAIR\n1 +\n2 -\n3 *\n4 \\\nOpcao:");
      opcao = scanner.nextInt();

      switch (opcao) {
        case 0:
          scanner.close();
          System.exit(0);

        case 1:
          System.out.print("Digite o 1o operando: ");
          c.setOperando1(scanner.nextDouble());
          System.out.print("Digite o 2o operando: ");
          c.setOperando2(scanner.nextDouble());
          c.setOperacao('+');
          c.calcular();
          System.out.println(c);
          break;

        case 2:
          System.out.print("Digite o 1o operando: ");
          c.setOperando1(scanner.nextDouble());
          System.out.print("Digite o 2o operando: ");
          c.setOperando2(scanner.nextDouble());
          c.setOperacao('-');
          c.calcular();
          System.out.println(c);
          break;
      }
    }

  }
}
