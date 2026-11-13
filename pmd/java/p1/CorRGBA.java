package pmd.java.p1;

public class CorRGBA extends CorRGB {

  private double a;

  public CorRGBA(int r, int g, int b, double a) {
    super(r,g,b);
    this.a = (a >= 0.0 && a <= 1.0) ? a : 0;
  }

  public String toString() {
    return super.toString() + "," + a;
  }

  public boolean transparente() {
    return  a == 0.0;
  }
}
