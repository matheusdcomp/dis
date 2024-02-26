package gui;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Janela extends JFrame {

  public Janela() {
    super("Minha janela");
    setSize(800, 600);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new BorderLayout());

    JButton bt1 = new JButton("Clique aqui");
    add(bt1, BorderLayout.NORTH);

    JPanel painel = new JPanel(new FlowLayout());
    add(painel, BorderLayout.CENTER);

    JButton bt2 = new JButton("Clique aqui");
    bt2.setPreferredSize(new Dimension(200, 300));
    bt2.setFont(new Font("ARIAL", Font.BOLD, 24));
    painel.add(bt2);

    JButton bt3 = new JButton("Clique aqui");
    painel.add(bt3);
    JLabel lb1 = new JLabel("Nome:");
    JTextField tf1 = new JTextField("djshfs", 50);
    painel.add(lb1);
    painel.add(tf1);

  }

  public static void main(String[] args) {
    Janela j = new Janela();
    j.setVisible(true);
  }

}
