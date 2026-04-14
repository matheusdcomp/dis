package aulas;


public class Leao extends Mamifero {
  protected boolean juba;
  public Leao() {
    super();
    this.juba = false;
  }
  public Leao(int peso, int idade, boolean juba) {
    super(peso, idade);
    this.juba = juba;
  }
  public String toString() {
    return super.toString() + ", juba=" + (juba?"sim":"nao");
  }
}