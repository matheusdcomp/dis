public class Complexo {

  private double a, b;

  public Complexo() {
    this.a = this.b = 0;
  }

  public Complexo(double a, double b) {
    this.a = a;
    this.b = b;
  }

  public Complexo soma(Complexo c) {
    return new Complexo(this.a + c.a, this.b + c.b);
  }

  public Complexo produto(Complexo c) {
    return new Complexo(
        this.a * c.a - this.b * c.b,
        this.b * c.a + this.a * c.b);
  }

  public Complexo conjugado() {
    return new Complexo(this.a, -this.b);
  }

  public String toString() {
    // return "(" + this.a + " + " + this.b + "i)";
    return String.format("(%.2f + %.2fi)", this.a, this.b);
  }

  public static void main(String[] args) {
    Complexo z = new Complexo(2, 3);
    Complexo w = new Complexo(4, 5);
    System.out.println(z + " + " + w + " = " + z.soma(w));

  }

}