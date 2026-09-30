package heranca;

public class C extends B {

  public C() {  
    super();
    this.z = 0;
  }

  public C(int x, int y, int z) {
    super(x,y);
    this.z = z;
  }

  private int z;

  public int getZ() {
    return z;
  }

  public void setZ(int z) {
    this.z = z;
  }

  @Override
  public String toString() {
    return ", Z:" + getZ() + super.toString() ;
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