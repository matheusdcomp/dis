package classes;

public class Circulo {

  private float raio;

  public Circulo() {
    raio = 0;
  } 

  public Circulo(float raio) {
    this.raio = raio;
  }

  public float area() {
    return 3.1415F * this.raio * this.raio;
  }

  public static void main(String[] args) {
    Circulo c = new Circulo(4);
    System.out.println("\nArea: " + c.area() );
  }
  
}