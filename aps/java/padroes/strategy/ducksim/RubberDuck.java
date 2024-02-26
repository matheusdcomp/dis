package strategy.ducksim;

public class RubberDuck extends Duck {

  public RubberDuck() {
    super(new Squeak(), new FlyNoWay());
  }

  @Override
  public void display() {
    System.out.println("Rubber duck");
  }

}
