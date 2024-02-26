package listas.listaex02.ex1;

public class Assistente extends Funcionario {

  protected int matricula;

  public Assistente() {
    super();
    this.matricula = 0;
  }

  public Assistente(String nome, String email, int matricula) {
    super(nome, email);
    this.matricula = matricula;
  }

  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public void exibeDados() {
    super.exibeDados();
    System.out.printf("\nMatricula: %d", matricula);
  }
}
