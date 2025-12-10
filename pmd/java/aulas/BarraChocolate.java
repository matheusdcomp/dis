package aulas;


class BarraChocolate extends Conteudo {

  private int porcentagemCacau;

  public BarraChocolate(float largura, float profundidade, float altura, int porcentagemCacau) {
    super(largura, profundidade, altura);
    this.porcentagemCacau = porcentagemCacau;
  }

  public int getPorcentagemCacau() {
    return porcentagemCacau;
  }

  public void setPorcentagemCacau(int porcentagemCacau) {
    this.porcentagemCacau = porcentagemCacau;
  }

  @Override
  public String toString() {
    return "Barra de Chocolate " + porcentagemCacau + "%, tamanho: " + super.toString();
  }
}
