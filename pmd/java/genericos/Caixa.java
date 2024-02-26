package genericos;

import java.util.ArrayList;

public class Caixa<T> {

  private T conteudo;

  public Caixa(T conteudo) {
    this.conteudo = conteudo;
  }

  public T getConteudo() {
    return conteudo;
  }

  public void setConteudo(T conteudo) {
    this.conteudo = conteudo;
  }

  public static void main(String[] args) {
    Caixa<Chocolate> c2 = new Caixa<>(new Chocolate());
    Caixa<Geladeira> c3 = new Caixa<>(new Geladeira());
    ArrayList<Float> lista = new ArrayList<>();

  }

}
