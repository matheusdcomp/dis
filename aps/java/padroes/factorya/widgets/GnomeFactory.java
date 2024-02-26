package factorya.widgets;

public class GnomeFactory extends WidgetFactory {
  public Botao criarBotao() {
    return new BotaoGnome();
  }

  public Janela criarJanela() {
    return new JanelaGnome();
  }
}
