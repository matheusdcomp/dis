package clp.tp.entidades;

public class Produto extends Entidade {

  private String nome;
  private double valor;

  public Produto() {
    super();
    nome = "";
    valor = 0.0;
  }

  public Produto(String nome, double valor) {
    super();
    this.nome = nome;
    this.valor = valor;
  }

  public String getNome() {
    return nome;
  }

  public double getValor() {
    return valor;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public String toString() {
    return String.format("%sNome: %s\tValor: %.2f", super.toString(), nome, valor);
  };

}