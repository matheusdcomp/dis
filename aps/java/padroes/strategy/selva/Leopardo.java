package strategy.selva;

public class Leopardo extends Animal {

  private Estrategia estrategia;

  public Estrategia getEstrategia() {
    return estrategia;
  }

  public void setEstrategia(Estrategia estrategia) {
    this.estrategia = estrategia;
  }

  public void acaoInicial() {
    estrategia.acaoInicial();
  }

  public void acaoFinal() {
    estrategia.acaoFinal();
  }

  public void avistarAnimal(Animal animal) {

    if (animal instanceof Gazela)
      setEstrategia(new AtacarSozinho());
    else if (animal instanceof Bisao)
      setEstrategia(new AtacarEmBando());
    else if (animal instanceof Leao)
      setEstrategia(new PrezarVida());

    acaoInicial();
    acaoFinal();

  }

}
