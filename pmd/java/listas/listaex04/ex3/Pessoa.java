package listas.listaex04.ex3;

public class Pessoa implements Comparable<Pessoa> {

  private String nome;
  private int idade;

  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  public int compareTo(Pessoa p) {
    return this.idade - p.idade;
  }

  public String toString() {
    return String.format("Pessoa{%s,%d}", nome, idade);
  }

}
