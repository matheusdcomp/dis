package aulas;

public abstract class Conteudo {
  
  protected float largura, profundidade, altura;

  public Conteudo(float largura, float profundidade, float altura) {
    this.largura = largura;
    this.altura = altura;
    this.profundidade = profundidade;
  }

  public float getLargura() {
    return largura;
  }

  public float getAltura() {
    return altura;
  }

  public float getProfundidade() {
    return profundidade;
  }

  public void setLargura(float largura) {
    this.largura = largura;
  }

  public void setAltura(float altura) {
    this.altura = altura;
  }

  public void setProfundidade(float profundidade) {
    this.profundidade = profundidade;
  }

  @Override
  public String toString() {
    return String.format("%.1fx%.1fx%.1f", largura, profundidade, altura);
  }

  public float volume() {
    return largura * profundidade * altura;
  }

}
