package listas.listaex02.ex3;

public class Circulo implements Geometria {

  private double raio;

  public Circulo(double raio) {
    super();
    this.raio = raio;
  }

  @Override
  public double area() {
    return 3.1415 * raio * raio;
  }

  @Override
  public double comprimento() {
    return 2 * 3.1415 * raio;
  }

  public String toString() {
    return String.format(
        "\nCÍRCULO { raio: %.2f, área: %.2f, comprimento: %.2f }",
        raio, area(), comprimento());
  }

}
