package aulas;

import java.util.Random;

public class Produto {

  private Integer id;
  private String nome;
  private Float valor;

  public Produto() {
    this.id = new Random(System.currentTimeMillis()).nextInt();
    this.nome = null;
    this.valor = null;
  }

  public Produto(Integer id, String nome, Float valor) {
    this.id = id;
    this.nome = nome;
    this.valor = valor;
  }

  public Produto(String nome, Float valor) {
    this.id = new Random(System.currentTimeMillis()).nextInt();
    this.nome = nome;
    this.valor = valor;
  }
  
  public Integer getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public Float getValor() {
    return valor;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setValor(Float valor) {
    this.valor = valor;
  }

  public String toString() {
    return String.format("Id: %d\tNome: %s\tValor: %.2f", id, nome, valor);
  }
  
}
