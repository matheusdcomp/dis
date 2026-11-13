package aulas;

public class Retangulo extends FormaGeometrica{
  private double base, altura;

  public Retangulo(double base, double altura) {
    super();
    this.base = base;
    this.altura = altura;
  }

  public double getAltura() {
    return altura;
  }

  public double getBase() {
    return base;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public void setBase(double base) {
    this.base = base;
  }

  @Override
  public String toString() {
    return String.format(
      "Retangulo: base = %.2f, altura = %.2f", 
      base, 
      altura);
  }

  @Override
  public double area() {
    return base * altura;
  }
}
