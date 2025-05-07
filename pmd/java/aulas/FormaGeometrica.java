package aulas;

public abstract class FormaGeometrica {

  private static int qtd;

  public static int getQtd() {
    return qtd;
  }

  public static void setQtd(int qtd) {
    FormaGeometrica.qtd = qtd;
  }

  public abstract String imprimir();

}
