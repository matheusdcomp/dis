package strategy.ducksim;

public class DecoyDuck extends Duck {

  public DecoyDuck() {
    super(new MuteQuack(), new FlyNoWay());
  }

  @Override
  public void display() {
    System.out.println("Decoy duck");
  }

}
