package p1;

public class CorMain {

  public static CorRGB[] cores = new CorRGB[4];
  public static void main(String[] args) {
    CorMain.cores[0] = new CorRGB(1,2,3);
    CorMain.cores[1] = new CorRGB(10,20,30);
    CorMain.cores[2] = new CorRGBA(1,2,3,0);
    CorMain.cores[3] = new CorRGBA(13,21,63,1) ;

    for (CorRGB c : CorMain.cores) {
      System.out.println(c);
      if (c instanceof CorRGBA) {
        CorRGBA x = (CorRGBA) c;
        System.out.println("Transparente? " + x.transparente());
      }
    }
  }
}
