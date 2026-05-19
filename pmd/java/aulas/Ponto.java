package aulas;

public class Ponto extends FormaGeometrica {

  private double x, y;

  public Ponto() {
    super();
    x = y = 0.0;
  }

  public Ponto(double x, double y) {
    super();
    this.x = x;
    this.y = y;
  }

  public double distancia(Ponto p) {
    return Math.sqrt(
      Math.pow(p.x - this.x,2) +
      Math.pow(p.y - this.y,2) 
    );
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public void setX(double x) {
    this.x = x;
  }

  public void setY(double y) {
    this.y = y;
  }
  
  @Override
  public double area() {
    return 0.0;
  }

  public String toString() {
    return String.format("PONTO (%.1f,%.1f)", x, y);
  }

}
