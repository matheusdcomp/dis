package aulas;


class Garrafa extends Conteudo {

  private String rotulo;

  public Garrafa(float largura, float profundidade, float altura, String rotulo) {
    super(largura, profundidade, altura);
    this.rotulo = rotulo;
  }

  public String getRotulo() {
    return rotulo;
  }

  public void setRotulo(String rotulo) {
    this.rotulo = rotulo;
  }

  @Override
  public String toString() {
    return "Garrafa de " + rotulo + ", tamanho: " + super.toString();
  }
}