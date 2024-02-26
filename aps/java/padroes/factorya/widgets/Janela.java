package factorya.widgets;

public abstract class Janela {
  public abstract void desenhar();
}

class JanelaKDE extends Janela {
  public void desenhar() {
    System.out.println("Eu sou uma janela KDE!");
  }
}

class JanelaGnome extends Janela {
  public void desenhar() {
    System.out.println("Eu sou uma janela Gnome!");
  }
}
