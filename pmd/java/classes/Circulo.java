package classes;

public class Circulo {

  private float raio;

  public Circulo() {
    raio = 0;
  } 

  public void setRaio(float raio) {
    this.raio = raio;
  }

  public float getRaio() {
    return raio;
  }

  public Circulo(float raio) {
    this.raio = raio;
  }

  public float area() {
    return 3.1415F * this.raio * this.raio;
  }

  
}