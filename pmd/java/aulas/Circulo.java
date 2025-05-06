package aulas;

public class Circulo extends FormaGeometrica implements Numeravel {

  private Ponto centro;
  private double raio;

  public Circulo(Ponto centro, double raio) {
    super();
    this.centro = centro;
    this.raio = raio;
  }

  public Ponto getCentro() {
    return centro;
  }

  public double getRaio() {
    return raio;
  }

  public void setCentro(Ponto centro) {
    this.centro = centro;
  }

  public void setRaio(double raio) {
    this.raio = raio;
  }

  public boolean pertence(Ponto p) {
    return raio >= p.distancia(centro);
  }

  @Override
  public String imprimir() {
    return "(Centro: " + centro.imprimir() + " Raio: " + raio + ")";
  }

  @Override
  public double numerar() {
    return raio;
  }

}
