package aulas;

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
}
