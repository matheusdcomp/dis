package aulas;

import java.util.Scanner;

public class FGMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    FormaGeometrica f = null;

    System.out.println("Deseja criar um circulo(c) ou ponto(p)? ");
    char opcao = sc.next().charAt(0);
    switch (opcao) {
      case 'c':
        System.out.println("Digite x e y do centro e o raio: ");
        f = new Circulo(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        break;
      case 'p':
        System.out.println("Digite x e y do ponto: ");
        f = new Ponto(sc.nextDouble(), sc.nextDouble());  
    }

    System.out.println(f);
    System.out.println("Area: " + f.area());
    if (f instanceof Circulo) {
      Circulo c = (Circulo) f;
      Mensuravel m = c;
      System.out.println("Comprimento: " + m.comprimento());
      System.out.println("(3,3) pertence ao circulo? " + c.pertence(new Ponto(3,3)));
      
    }
    else if (f instanceof Ponto) {
      Ponto p = (Ponto) f;
      System.out.println("Distancia para (3,3): " + p.distancia(new Ponto(3,3)));
    }

    sc.close();
  }
}
