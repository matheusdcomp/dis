package listas.listaex02.ex3;

public class Retangulo implements Geometria {

  private double base, altura;

  public Retangulo(double base, double altura) {
    super();
    this.base = base;
    this.altura = altura;
  }

  @Override
  public double area() {
    return base * altura;
  }

  @Override
  public double comprimento() {
    return 2 * base + 2 * altura;
  }

  public String toString() {
    return String.format(
        "\nCÍRCULO { base: %.2f, altura: %.2f, área: %.2f, comprimento: %.2f }",
        base, altura, area(), comprimento());
  }

}
