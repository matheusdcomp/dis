package aps.java.loja.modelo;

public class Produto extends Entidade {

  private String nome;
  private float valor;

  public Produto() {
    super();
    this.nome = "";
    this.valor = 0f;

  }

  public Produto(int id, String nome, float valor) {
    super(id);
    this.nome = nome;
    this.valor = valor;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public float getValor() {
    return valor;
  }

  public void setValor(float valor) {
    this.valor = valor;
  }

}