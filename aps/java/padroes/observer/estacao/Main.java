package observer.estacao;

public class Main {

  public static void main(String[] args) {
    Estacao e = Estacao.getInstance();
    // JEstacao je = new JEstacao(e);
    Aplicativo a1 = new Aplicativo();
    Aplicativo a2 = new Aplicativo();
    e.addObserver(a1);
    e.addObserver(a2);
  }

}
