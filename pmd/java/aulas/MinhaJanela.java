package aulas;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;

public class MinhaJanela extends JFrame {

  public MinhaJanela(){
    super("Minha Janela");
    setSize(800, 800);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());


    var lbNome = new JLabel("Nome:");
    var tfNome = new JTextField(20);
    var lbDesc = new JLabel("Descrição:");
    var taDesc = new TextArea(20, 20);
    var ckBR = new JCheckBox("Brasileiro?");
    var cbTipo = new JComboBox<String>(new String[]{"A", "B", "C"});
    var btOK = new JButton("OK");

    lbNome.setFont(new Font("Arial", Font.BOLD, 20));    
    tfNome.setFont(new Font("Arial", Font.BOLD, 20));    
    btOK.setFont(new Font("Arial", Font.BOLD, 20));
    btOK.setPreferredSize(new Dimension(100,100));
    btOK.setBackground(new Color(0,0,255));
    btOK.setForeground(new Color(255,255,255));

    add(lbNome);
    add(tfNome);
    add(lbDesc);
    add(taDesc);
    add(ckBR);
    add(cbTipo);
    add(btOK);
    
    
  }

  public static void main(String[] args) {
    var j = new MinhaJanela();
    j.setVisible(true);
  }
  
}
