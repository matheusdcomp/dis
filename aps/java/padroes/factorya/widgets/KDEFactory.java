package factorya.widgets;

class KDEFactory extends WidgetFactory {
  public Botao criarBotao() {
    return new BotaoKDE();
  }

  public Janela criarJanela() {
    return new JanelaKDE();
  }
}
