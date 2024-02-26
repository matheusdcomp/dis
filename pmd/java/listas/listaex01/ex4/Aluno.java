package listas.listaex01.ex4;

public class Aluno {

  private int registro;
  private String nome;

  public Aluno() {
    this.registro = 0;
    this.nome = "";
  }

  public Aluno(int registro, String nome) {
    this.registro = registro;
    this.nome = nome;
  }

  public int getRegistro() {
    return registro;
  }

  public String getNome() {
    return nome;
  }

  public void setRegistro(int registro) {
    this.registro = registro;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String toString() {
    return String.format(
        "{registro: %d, nome: %s}",
        registro, nome);
  }
}
