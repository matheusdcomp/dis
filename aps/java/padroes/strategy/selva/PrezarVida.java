package strategy.selva;

public class PrezarVida implements Estrategia {

  @Override
  public void acaoInicial() {
    System.out.println("Rezar para n�o ter sido visto.");
  }

  @Override
  public void acaoFinal() {
    System.out.println("Fugir como se sua vida dependesse disso.");
  }

}
