package factorya.widgets;

public abstract class Botao {
  public abstract void desenhar();
}

class BotaoKDE extends Botao {
  public void desenhar() {
    System.out.println("Eu sou um botao KDE!");
  }
}

class BotaoGnome extends Botao {
  public void desenhar() {
    System.out.println("Eu sou um botao Gnome!");
  }
}
