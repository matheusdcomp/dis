package aulas;

public class NodoPilha<T> {

  private T valor;
  private NodoPilha<T> prox;

  public NodoPilha(T valor) {
    this.valor = valor;
    this.prox = null;
  }

  public NodoPilha(T valor, NodoPilha<T> prox) {
    this.valor = valor;
    this.prox = prox;
  }

  public NodoPilha<T> getProx() {
    return prox;
  }

  public T getValor() {
    return valor;
  }

  public void setProx(NodoPilha<T> prox) {
    this.prox = prox;
  }

  public void setValor(T valor) {
    this.valor = valor;
  }

  @Override
  public String toString() {
    return valor.toString();
  }
  
}
