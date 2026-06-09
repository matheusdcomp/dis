package aulas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

public class JanelaFlow extends JFrame {

  public JanelaFlow() {
    super();
    setTitle("Minha janela");
    //setSize(500, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());

    Font font = new Font("Arial", Font.BOLD, 20);

    JLabel lb1 = new JLabel("Digite algo: ");
    lb1.setFont(font);
    JTextField tf1 = new JTextField(10);
    tf1.setFont(font);
    JButton bt1 = new JButton("Clique aqui");
    bt1.setFont(font);
    bt1.setPreferredSize(new Dimension(200, 30));

    add(lb1);
    add(tf1);
    add(bt1);    
  }

  public static void main(String[] args) {
    JanelaFlow j = new JanelaFlow();
    j.pack();//ajusta o tamanho da janela ao seu conteúdo
    j.setVisible(true);
  }
  
}
