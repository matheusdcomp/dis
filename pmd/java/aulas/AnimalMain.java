package aulas;

public class AnimalMain {
  public static void main(String[] args) {
    Animal a = new Animal(200);
    System.out.println(a.toString());
    a = new Mamifero(500,10);
    System.out.println(a.toString());
    a = new Leao(300, 7, true);
    System.out.println(a.toString());
  }
}
