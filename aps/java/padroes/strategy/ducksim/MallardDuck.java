package strategy.ducksim;

public class MallardDuck extends Duck {

  public MallardDuck() {
    super(new Quack(), new FlyWithWings());
  }

  @Override
  public void display() {
    System.out.println("Mallard duck");
  }

}
