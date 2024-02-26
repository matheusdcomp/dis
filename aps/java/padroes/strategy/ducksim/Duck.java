package strategy.ducksim;

public abstract class Duck {

  protected QuackBehaviour quackBehaviour;
  protected FlyBehaviour flyBehaviour;

  public Duck(QuackBehaviour quackBehaviour, FlyBehaviour flyBehaviour) {
    this.quackBehaviour = quackBehaviour;
    this.flyBehaviour = flyBehaviour;
  }

  public QuackBehaviour getQuackBehaviour() {
    return quackBehaviour;
  }

  public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
    this.quackBehaviour = quackBehaviour;
  }

  public FlyBehaviour getFlyBehaviour() {
    return flyBehaviour;
  }

  public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
    this.flyBehaviour = flyBehaviour;
  }

  public void performFly() {
    flyBehaviour.fly();
  }

  public void performQuack() {
    quackBehaviour.quack();
  }

  public void swim() {
    System.out.println("Nadando..");
  }

  public abstract void display();

}
