package strategy.heroi;

public class Main {

  public static void main(String[] args) {
    Heroi heroi = new Heroi();
    for (int i = 1; i <= 10; i++) {
      System.out.println("Stage " + i);
      heroi.setArma(i % 2 == 0 ? new Trabuco() : new Facao());
      heroi.atacar();
    }
  }

}
