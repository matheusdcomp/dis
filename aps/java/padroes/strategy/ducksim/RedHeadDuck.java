package strategy.ducksim;

public class RedHeadDuck extends Duck {

  public RedHeadDuck() {
    super(new Quack(), new FlyWithWings());
  }

  @Override
  public void display() {
    System.out.println("Red head duck");
  }

}
