package aulas;

public class FormaGeometricaMain {
  public static void main(String[] args) {
    FormaGeometrica f1 = new Ponto(3,4);
    FormaGeometrica f2 = new Circulo(new Ponto(1,1),5);

    System.out.println(f1.toString());
    System.out.println(f2.toString());

    Ponto p1 = (Ponto) f1;
    Ponto p2 = new Ponto(7,10);
    
    System.out.println("Area f1: " + f1.area());
    System.out.println("Distancia f1 para (7,10): " + p1.distancia(p2));

    System.out.println("Area f2: " + f2.area());
    System.out.println("(7,10) pertence a f2? " + 
      (((Circulo)f2).pertence(p2) ? "sim" : "nao"));
  }
}
