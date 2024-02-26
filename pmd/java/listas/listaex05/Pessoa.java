package listas.listaex05;

public class Pessoa {

  private String nome;
  private String cidade;
  private String estado;
  private char sexo;

  public Pessoa() {
    this.nome = "";
    this.cidade = "";
    this.estado = "";
    this.sexo = 'M';
  }

  public Pessoa(String nome, String cidade, String estado, char sexo) {
    this.nome = nome;
    this.cidade = cidade;
    this.estado = estado;
    this.sexo = sexo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public char getSexo() {
    return sexo;
  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
  }

  @Override
  public String toString() {
    return "Pessoa [nome=" + nome + ", cidade=" + cidade +
        ", estado=" + estado + ", sexo=" + sexo + "]";
  }

}
