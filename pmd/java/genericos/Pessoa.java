package genericos;

public class Pessoa implements Comparable<Pessoa> {

  protected String nome;
  protected int idade;
  protected float altura;

  public Pessoa(String n, int i, float a) {
    nome = n;
    idade = i;
    altura = a;
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

  public float getAltura() {
    return altura;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public void setAltura(float altura) {
    this.altura = altura;
  }

  public int compareTo(Pessoa p) {
    return this.idade - p.idade;
  }

  public static void main(String[] a) {
    Pessoa[] ps = new Pessoa[3];
    ps[0] = new Pessoa("JOAO", 20, 1.70f);
    ps[1] = new Pessoa("MARIA", 23, 1.60f);
    ps[2] = new Pessoa("JOSE", 35, 1.69f);
    int maiores = new Teste<Pessoa>().contaMaiores(ps, new Pessoa("LUCAS", 21, 1.80f), 3);
    System.out.println(maiores);
  }

}
