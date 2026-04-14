package aulas;

public class Mamifero extends Animal {
  protected int idade;
  public Mamifero() {
    super();
    this.idade = 0;
  }
  public Mamifero(int peso, int idade) {
    super(peso);
    this.idade = idade;
  }
  public String toString() {
    return super.toString() + ", idade=" + idade;
  }
}

