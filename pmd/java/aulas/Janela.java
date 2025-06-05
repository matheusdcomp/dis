package aulas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;

public class Janela extends JFrame {

  public Janela() {
    super("Minha Janela");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(800, 600);

    JPanel painel = new JPanel(new FlowLayout());
    add(painel, BorderLayout.CENTER);

    JButton bt1 = new JButton("Botão 1");
    bt1.setFont(new Font("Arial", Font.BOLD, 20));
    add(bt1, BorderLayout.NORTH);

    JLabel lb1 = new JLabel("Nome:");
    JTextField tf1 = new JTextField(50);
    painel.add(lb1);
    painel.add(tf1);

    JCheckBox ck1 = new JCheckBox("Marcar?");
    painel.add(ck1);

    var rd1 = new JRadioButton("Ligado", false);
    var rd2 = new JRadioButton("Desligado", false);
    ButtonGroup bg = new ButtonGroup();
    bg.add(rd1);
    bg.add(rd2);
    JPanel rp = new JPanel();
    rp.setBorder(BorderFactory.createTitledBorder("Status"));
    rp.add(rd1);
    rp.add(rd2);
    painel.add(rp);

    var cb1 = new JComboBox<String>(new String[] { "OP1", "OP2" });
    painel.add(cb1);

    var ta1 = new JTextArea(10, 10);
    painel.add(ta1);

    JButton bt2 = new JButton("Botão 1");
    bt2.setPreferredSize(new Dimension(100, 100)); // ou bt2.setBackground(Color.RED);
    bt2.setBackground(new Color(255, 0, 0)); // ou bt2.setBackground(Color.RED);
    painel.add(bt1);

  }

  public static void main(String[] args) {
    Janela j = new Janela();
    j.setVisible(true);
  }

}