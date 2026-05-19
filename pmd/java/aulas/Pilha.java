package aulas;

import java.util.ArrayList;
import java.util.List;

public class Pilha<T> {

  private NodoPilha<T> inicio;
  
  public Pilha() {
    this.inicio = null;
  }

  public void add(T valor) {
    inicio = new NodoPilha<T>(valor, inicio);
  }

  public T rem() {
    if (vazia()) return null;
    T valor = inicio.getValor();
    inicio = inicio.getProx();
    return valor;
  }
  
  public List<T> toArray() {
    List<T> lista = new ArrayList<>(tamanho());
    NodoPilha<T> atual = inicio;
    while(atual != null) {
      lista.add(atual.getValor());
      atual = atual.getProx();
    }
    return lista;
  }

  public boolean vazia() {
    return inicio == null;
  }

  public int tamanho() {
    int tam = 0;
    NodoPilha<T> atual = inicio;
    while(atual != null) {
      tam++;
      atual = atual.getProx();
    }
    return tam;
  }

  public String toString() {
    StringBuilder s = new StringBuilder("[");
    NodoPilha<T> atual = inicio;
    while(atual != null) {
      s.append(atual.getValor() + (atual.getProx() == null ? "]" : ","));
      atual = atual.getProx();
    }
    return s.toString();
  }
  
}
