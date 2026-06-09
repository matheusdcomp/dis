package aulas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Font;

public class JanelaBorder extends JFrame {

  public JanelaBorder() {
    super();
    setTitle("Minha janela");
    setSize(500, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());

    Font font = new Font("Arial", Font.BOLD, 20);

    JLabel lb1 = new JLabel("Digite algo: ");
    lb1.setFont(font);
    JTextField tf1 = new JTextField();
    tf1.setFont(font);
    JButton bt1 = new JButton("CLique aqui");
    bt1.setFont(font);

    add(lb1, BorderLayout.WEST);
    add(tf1, BorderLayout.CENTER);
    add(bt1, BorderLayout.SOUTH);

  }

  public static void main(String[] args) {
    JanelaBorder j = new JanelaBorder();
    j.setVisible(true);
  }
  
}
