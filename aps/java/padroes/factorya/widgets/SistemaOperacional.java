package factorya.widgets;

import javax.swing.JOptionPane;

public class SistemaOperacional {

  public static void main(String[] args) {
    Janela janela;
    Botao botao;
    WidgetFactory fabrica;

    for (int i = 0; i < 3; i++) {
      String sistema = JOptionPane.showInputDialog("Informe o sistema de janelas:");
      fabrica = WidgetFactory.obterFactory(sistema);
      janela = fabrica.criarJanela();
      botao = fabrica.criarBotao();

      janela.desenhar();
      botao.desenhar();
    }
  }

}
