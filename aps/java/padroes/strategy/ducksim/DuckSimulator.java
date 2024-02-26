package strategy.ducksim;

public class DuckSimulator {

  public static void main(String[] args) {

    System.out.println("########################");

    Duck d1 = new MallardDuck();
    d1.display();
    d1.swim();
    d1.performFly();
    d1.performQuack();
    System.out.println("########################");

    d1 = new RedHeadDuck();
    d1.display();
    d1.swim();
    d1.performFly();
    d1.performQuack();

    System.out.println("########################");

    d1 = new DecoyDuck();
    d1.display();
    d1.swim();
    d1.performFly();
    d1.performQuack();

    System.out.println("########################");

    d1 = new RubberDuck();
    d1.display();
    d1.swim();
    d1.performFly();
    d1.performQuack();

    System.out.println("########################");
    System.out.println("Ruber duck with super power: FLY");
    d1.setFlyBehaviour(new FlyWithWings());
    d1.display();
    d1.swim();
    d1.performFly();
    d1.performQuack();

  }

}
