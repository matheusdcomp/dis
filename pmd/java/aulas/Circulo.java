package aulas;

public class Circulo extends FormaGeometrica implements Numeravel {

  private Ponto centro;
  private double raio;

  public Circulo() {
    super();
    this.centro = new Ponto(0,0);
    this.raio = 0;
  }

  public Circulo(Ponto centro, double raio) {
    super();
    this.centro = centro;
    this.raio = raio;
  }

  public Ponto getCentro() {
    return centro;
  }

  public double getRaio() {
    return raio;
  }

  public void setCentro(Ponto centro) {
    this.centro = centro;
  }

  public void setRaio(double raio) {
    this.raio = raio;
  }

  public boolean pertence(Ponto p) {
    return raio >= p.distancia(centro);
  }

  @Override
  public String imprimir() {
    return "(Centro: " + centro.imprimir() + " Raio: " + raio + ")";
  }

  @Override
  public double numerar() {
    return raio;
  }

  public static void main(String[] args) {
    Ponto p1 = new Ponto(1,1);
    Ponto p2 = new Ponto(2,2);

    

    Circulo c = new Circulo(p1, 4);
    
    c.getQtd()

    
    if ( c.pertence( p2 ) )
    System.out.println( "pertence");
  }

}
