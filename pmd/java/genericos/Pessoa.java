package genericos;

public class Pessoa implements Comparable<Pessoa> {

  protected String nome;
  protected int idade;

  public Pessoa(String n, int i) {
    nome = n;
    idade = i;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public int compareTo(Pessoa p) {
    return this.idade - p.idade;
  }

  public static void main(String[] a) {
    Pessoa[] ps = new Pessoa[3];
    ps[0] = new Pessoa("JOAO", 20);
    ps[1] = new Pessoa("MARIA", 23);
    ps[2] = new Pessoa("JOSE", 35);
    int maiores = new Teste<Pessoa>().contaMaiores(ps, new Pessoa("LUCAS", 21), 3);
  }

}
