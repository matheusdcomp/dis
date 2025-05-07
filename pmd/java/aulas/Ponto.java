package aulas;

public class Ponto extends FormaGeometrica implements Numeravel {

  private double x, y;

  public Ponto() {
    this.x = 0;
    this.y = 0;
  }

  public Ponto(double x, double y) {
    this.x = x;
    this.y = y;
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

  public double distancia(Ponto p) {
    return Math.sqrt(
        Math.pow(this.x - p.x, 2) +
            Math.pow(this.y - p.y, 2));
  }

  @Override
  public String imprimir() {
    return "(" + x + "," + y + ")";
  }

  public static void main(String[] args) {
    Ponto a = new Ponto();
    Ponto b = new Ponto();
    a.distancia(b);
    a.x = 10;
  }

  @Override
  public double numerar() {
    return x + y;
  }

}
