package heranca;

public class A {

  public A() {
    x = 0;
  }

  public A(int x) {
    this.x = x;
  }

  protected int x;

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public String toString() {
    return "X:" + getX();
  }

  public static void main(String[] args) {
    A a = new A();
    a.setX(4);
    System.out.println(a.getX());
  }
}