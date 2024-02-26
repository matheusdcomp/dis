package dao.daofile.model;

public class Pessoa extends Entidade {

  private String nome;

  public Pessoa() {
    super();
    this.nome = "";
  }

  public Pessoa(int id, String nome) {
    super(id);
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public String toString() {
    return "Pessoa{ " + super.toString() + "; nome:" + this.nome + "}";
  }

}