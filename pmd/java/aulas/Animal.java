package aulas;

public class Animal {
  protected int peso;
  public Animal() {
    this.peso = 0;
  }
  public Animal(int peso) {
    this.peso = peso;
  }
  public String toString() {
    return "peso=" + peso;
  }
}
