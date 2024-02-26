package listas.listaex04.ex2;

public class NodoLista<T> {

  private T dado;
  private NodoLista<T> proximo;

  public NodoLista() {
    dado = null;
    proximo = null;
  }

  public NodoLista(T dado, NodoLista<T> proximo) {
    this.dado = dado;
    this.proximo = proximo;
  }

  public T getDado() {
    return dado;
  }

  public void setDado(T dado) {
    this.dado = dado;
  }

  public NodoLista<T> getProximo() {
    return proximo;
  }

  public void setProximo(NodoLista<T> proximo) {
    this.proximo = proximo;
  }

  public String toString() {
    return dado.toString();
  }

}
