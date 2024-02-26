package listas.listaex04.ex3;

public class Lista<T extends Comparable<T>> {

  private NodoLista<T> inicio;
  private int tamanho;

  public Lista() {
    inicio = null;
    tamanho = 0;
  }

  public void add(T dado) {

    if (inicio == null) {
      inicio = new NodoLista<T>(dado, null);
    } else if (dado.compareTo(inicio.getDado()) < 0) {
      inicio = new NodoLista<T>(dado, inicio);
    } else {
      NodoLista<T> atual = inicio;
      for (int i = 0; i < tamanho - 1; i++) {
        if (dado.compareTo(atual.getProximo().getDado()) <= 0)
          break;
        atual = atual.getProximo();
      }
      atual.setProximo(new NodoLista<T>(dado, atual.getProximo()));
    }
    tamanho++;
  }

  public int indexOf(T dado) {
    NodoLista<T> atual = inicio;
    for (int i = 0; i < tamanho; i++) {
      if (atual.getDado().equals(dado))
        return i;
      atual = atual.getProximo();
    }
    return -1;
  }

  public T remove(int index) {

    if (index < 0 || index > tamanho) {
      System.out.println("Posi��o inv�lida: " + index);
      return null;
    }

    T dado = null;

    if (index == 0) {
      dado = inicio.getDado();
      inicio = inicio.getProximo();
    } else {
      NodoLista<T> atual = inicio;
      for (int i = 0; i < index - 1; i++)
        atual = atual.getProximo();
      dado = atual.getProximo().getDado();
      atual.setProximo(atual.getProximo().getProximo());
    }

    tamanho--;
    return dado;

  }

  public String toString() {
    NodoLista<T> atual = inicio;
    String saida = "";
    for (int i = 0; i < tamanho; i++) {
      saida += atual + " ";
      atual = atual.getProximo();
    }
    return saida;
  }

}
