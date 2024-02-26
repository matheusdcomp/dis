package factorya.widgets;

public abstract class WidgetFactory {

  public static WidgetFactory obterFactory(String lookAndFeel) {

    if (lookAndFeel.equalsIgnoreCase("kde")) {
      return new KDEFactory();
    } else {
      return new GnomeFactory();
    }
  }

  public abstract Botao criarBotao();

  public abstract Janela criarJanela();
}
