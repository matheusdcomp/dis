package aulas;

public abstract class FormaGeometrica {

  private static int qtd;

  public FormaGeometrica() {
    super();
  }  

  public static int getQtd() {
    return qtd;
  }

  public static void setQtd(int qtd) {
    FormaGeometrica.qtd = qtd;
  }

  public abstract String imprimir();

  public static void main(String[] args) {

    System.out.println(FormaGeometrica.qtd);
  }

}
