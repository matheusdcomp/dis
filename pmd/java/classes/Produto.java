package classes;

public class Produto {

  private String nome;
  private float valor;
  private static int qtd = 0;

  public Produto() {
    nome = null;
    valor = 0f;
    qtd++;
  }

  public Produto(String nome, float valor) {
    this.nome = nome;
    this.valor = valor;
    qtd++;
  }

  public static int getQtd() {
    return qtd;
  }

  public String getNome() {
    return this.nome;
  }

  public float getValor() {
    return valor;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setValor(float valor) {
    this.valor = valor;
  }

  public void imprimir() {
    System.out.println("\nNome: " + nome + "\nValor: " + valor);
  }

}
