package listas.listaex04.ex1;

public class Produto<T> implements Comparable<Produto<T>> {

  private T codigo;
  private String nome;
  private float valor;

  public Produto(T codigo, String nome, float valor) {
    this.codigo = codigo;
    this.nome = nome;
    this.valor = valor;
  }

  public String toString() {
    return "Produto 	{ codigo = '" + codigo + "', nome = '"
        + nome + "', valor = '" + valor + "'}";
  }

  public int compareTo(Produto<T> p) {
    int r = this.nome.compareTo(p.nome);
    return r != 0 ? r : (int) (this.valor - p.valor);
  }

}
