package strategy.heroi;

public class Heroi {

  private Arma arma;

  public void setArma(Arma arma) {
    this.arma = arma;
  }

  public void atacar() {
    arma.atacar();
  }

}
