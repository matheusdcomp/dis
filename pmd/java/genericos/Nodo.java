package genericos;

public class Nodo<T extends Comparable<T>> {

  private T conteudo;

  public Nodo(T conteudo) {
    this.conteudo = conteudo;
  }

  public Nodo() {
    conteudo = null;
  }

  public T getConteudo() {
    return conteudo;
  }

  public void setConteudo(T conteudo) {
    this.conteudo = conteudo;
  }

  public static void main(String[] args) {
    Nodo<Integer> n = new Nodo<>();
    n.setConteudo(7);

  }

  public int contaMaiores(T[] v, T e) {
    int count = 0;
    for (int i = 0; i < v.length; i++)
      if (v[i].compareTo(e) > 0)
        ++count;
    return count;
  }

}
