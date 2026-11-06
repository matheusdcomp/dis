package aulas;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class MinhaJanela extends JFrame {

  public MinhaJanela() {
    setLayout(new FlowLayout());

    setSize(800, 600);

    JButton b1 = new JButton("Botao 1");
    JButton b2 = new JButton("Botao 2");
    JButton b3 = new JButton("Botao 3");

    add(b1);
    add(b3);
    add(b2);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
  }

  public static void main(String[] args) {
    MinhaJanela j = new MinhaJanela();
    j.setVisible(true);
  }
  
}
