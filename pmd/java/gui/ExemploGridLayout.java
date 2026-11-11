package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class ExemploGridLayout extends JFrame {

  public ExemploGridLayout() {
    super("Exemplode GridLayout");
    setSize(800, 800);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new GridLayout(2,3,10,10));

    for(int i = 0; i < 6; i++) {
      add(new JButton("Botão " + (i+1)));
    }

  }

  public static void main(String[] args) {
    new ExemploGridLayout().setVisible(true);
  }
  
}
