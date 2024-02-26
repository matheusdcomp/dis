package listas.listaex01.ex4;

public class Disciplina {

  private int codigo;
  private String nome;
  private float valor;

  public Disciplina() {
    this.codigo = 0;
    this.nome = "";
    this.valor = 0.0F;
  }

  public Disciplina(int codigo, String nome, float valor) {
    this.codigo = codigo;
    this.nome = nome;
    this.valor = valor;
  }

  public int getCodigo() {
    return codigo;
  }

  public String getNome() {
    return nome;
  }

  public float getValor() {
    return valor;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setValor(float valor) {
    this.valor = valor;
  }

  public String toString() {
    return String.format(
        "{codigo: %d, nome: %s, valor: %.2f}",
        codigo, nome, valor);
  }
}
