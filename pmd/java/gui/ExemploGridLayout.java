package gui;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ExemploGridLayout extends JFrame {

    public ExemploGridLayout() {
      super("Exemplo de GridLayout");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(300, 200);
      setLayout(new GridLayout(3, 2, 5, 5));
      for (int i = 1; i <= 6; i++) {
        add(new JButton("Botão " + i));
      }
    }

    public static void main(String[] args) {
      ExemploGridLayout frame = new ExemploGridLayout();
      frame.setVisible(true);
    }
}