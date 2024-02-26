package listas.listaex02.ex1;

public class Funcionario {

  protected String nome, email;

  public Funcionario() {
    this.nome = this.email = "";
  }

  public Funcionario(String nome, String email) {
    this.nome = nome;
    this.email = email;
  }

  public String getEmail() {
    return email;
  }

  public String getNome() {
    return nome;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void exibeDados() {
    System.out.printf("\n\nNome: %s\nEmail: %s", nome, email);
  }

}