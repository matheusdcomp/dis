package aulas;

import java.io.Serializable;

public class Pacote<T extends Serializable & Comparable<T>> implements Comparable<Pacote<T>> {

  private T conteudo;
  private String erro;
  private boolean status;

  public Pacote(T conteudo, String erro, boolean status) {
    this.conteudo = conteudo;
    this.erro = erro;
    this.status = status;
  }

  public Pacote(T conteudo) {
    this.conteudo = conteudo;
    this.erro = null;
    this.status = true;
  }

  public T getConteudo() {
    return conteudo;
  }

  public String getErro() {
    return erro;
  }

  public boolean isStatus() {
    return status;
  }

  public void setConteudo(T conteudo) {
    this.conteudo = conteudo;
  }

  public void setErro(String erro) {
    this.erro = erro;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  @Override
  public String toString() {
    if (!status) {
      return erro;
    }
    return conteudo.toString();
  }

  public int compareTo(Pacote<T> p) {
    return this.conteudo.compareTo(p.conteudo);
  }
  
}
