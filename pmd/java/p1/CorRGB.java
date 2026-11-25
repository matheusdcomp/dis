package p1;

public class CorRGB {

  protected int r, g, b;

  public CorRGB(int r, int g, int b) {

    this.r = this.g = this.b = 255;

    if (r >= 0 && r <= 255)
      this.r = r;
    if (g >= 0 && g <= 255)
      this.g = g;
    if (b >= 0 && b <= 255)
      this.b = b;    
  }

  public String toString() {
    return r + "," + g + "," + b;
  }
  
}
