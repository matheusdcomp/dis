package aulas;

import java.util.Comparator;

public class Circulo extends FormaGeometrica {
  private double raio;
  public Circulo(double raio) {
    super();
    this.raio = raio;
  }

  public void setRaio(double raio) {
    this.raio = raio;
  }

  public double getRaio() {
    return raio;
  }

  @Override
  public String toString() {
    return String.format("Circulo: raio = %.2f",raio);
  }

  @Override
  public double area() {
    return Math.PI * raio * raio; 
  }

  public static void main(String[] args) {
    Circulo c1 = new Circulo(4);
    Circulo c2 = new Circulo(5);

    //Comparator cc = new CirculoComparator();

    var cc = new Comparator<Circulo>() {
      public int compare(Circulo a, Circulo b) {
        return (int) (a.getRaio() - b.getRaio());
      }
    };

    Comparator<Circulo> cc2 = 
      (Circulo a, Circulo b) -> (int) (a.getRaio() - b.getRaio());
     
    if (cc.compare(c1, c2) == 0) {
      System.out.println(c1 + " é igual ao " + c2);
    }
    else if (cc.compare(c1, c2) < 0) {
      System.out.println(c2 + " é maior que " + c1);
    }
    else {
      System.out.println(c1 + " é maior que " + c2);
    }

  }

  private class CirculoComparator implements Comparator<Circulo> {
    public int compare(Circulo a, Circulo b) {
    return (int) (a.getRaio() - b.getRaio());
    }
  }

}


