package classes;

public class TestaCirculo {
  public static void alteraRaio(Circulo x, float r) {
    x.setRaio(r);
  }
  public static void main(String[] args){
    float f = 4;
    Circulo c = new Circulo();
    alteraRaio( c, f );
    System.out.println(c.getRaio());
  }
}
