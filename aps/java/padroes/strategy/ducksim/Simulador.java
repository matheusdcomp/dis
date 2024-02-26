package strategy.ducksim;

public class Simulador {

  public static void main(String[] args) {
    Duck duck = new DecoyDuck();

    duck.display();
    duck.swim();
    duck.performFly();
    duck.performQuack();

    System.out.println("\nA fada madrinha deu vida a ele.");
    duck.setFlyBehaviour(new FlyWithWings());
    duck.setQuackBehaviour(new Quack());

    duck.display();
    duck.swim();
    duck.performFly();
    duck.performQuack();

  }

}
