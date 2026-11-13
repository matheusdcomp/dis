package aulas;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FormasMain {
  public static void main(String[] args) {
    List<FormaGeometrica> formas = new LinkedList<>();
    Scanner s = new Scanner(System.in);
    int op;

    while (true) {
      System.out.print("\n0 SAIR\n1 CIRCULO\n2RET\n3VER: ");
      op = s.nextInt();

      switch (op) {
        case 0:
          s.close();
          return;
        case 1:
          System.out.print("Digite o raio: ");
          formas.add(new Circulo(s.nextDouble()));
          break;
        case 2:
          System.out.print("Digite a base e a altura: ");
          formas.add(new Retangulo(s.nextDouble(), s.nextDouble()));
          break;  
        case 3:
          for (FormaGeometrica f : formas)
            System.out.println(f.toString());

          
      }
      
    }

    
  }
}
