package aulas;

import java.io.Serializable;

public class Circulo extends FormaGeometrica implements Mensuravel, Serializable {

  protected Ponto centro;
  protected double raio;

  public Circulo() {
    super();
    centro = new Ponto(0.0, 0.0);
    raio = 0.0;
  }

  public Circulo(Ponto centro, double raio) {
    super();
    this.centro = centro;
    this.raio = raio;
  }

  public Circulo(double xcentro, double ycentro, double raio) {
    super();
    this.centro = new Ponto(xcentro, ycentro);
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

  public String toString() {
    return String.format(
      "CIRCULO ((%.1f,%.1f), %.1f)", 
      centro.getX(), 
      centro.getY(), 
      raio
    );
  }

  public double area() {
    return Math.PI * raio * raio;
  }

  public double comprimento() {
    return 2.0 * Math.PI * raio;
  }

  public boolean pertence(Ponto p) {
    return p.distancia(centro) <= raio;
  }

}
