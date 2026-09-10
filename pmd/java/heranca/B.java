package heranca;

public class B extends A {

  public B() {  
    super();
    this.y = 0;
  }

  public B(int x, int y) {
    super(x);
    this.y = y;
  }

  private int y;

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  @Override
  public String toString() {
    return ", Y:" + getY() + super.toString() ;
  }

  public static void main(String[] args) {

    A a = new A();
    //System.out.println(a.getX());
    System.out.println(a.toString());

    B b = new B();
    //System.out.println(b.getX());
    //System.out.println(b.getY());
    System.out.println(b.toString());
  }
}