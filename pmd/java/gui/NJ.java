package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NJ extends JFrame {

  private JLabel rotulo;
  private JButton btOK, btCn;

  public NJ() {
    super("MINHA JANELA");
    setSize(400, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());

    rotulo = new JLabel("scdfsdfadf");
    rotulo.setFont(new Font("ARIAL", Font.BOLD, 20));
    add(rotulo, BorderLayout.SOUTH);

    JPanel painel = new JPanel(new FlowLayout());
    add(painel, BorderLayout.CENTER);

    ActionListener tratador = new ActionListener() {

      public void actionPerformed(ActionEvent e) {
        rotulo.setText("Você clicou no botão " + ((JButton) e.getSource()).getText());
      }

    };

    btOK = new JButton("OK");
    btOK.setPreferredSize(new Dimension(150, 150));
    btOK.setFont(new Font("ARIAL", Font.BOLD, 20));
    btOK.addActionListener(tratador);
    painel.add(btOK);

    btCn = new JButton("Cancel");
    btCn.setPreferredSize(new Dimension(150, 150));
    btCn.setFont(new Font("ARIAL", Font.BOLD, 20));
    btCn.addActionListener(tratador);
    painel.add(btCn);

    setVisible(true);
  }

  public static void main(String[] args) {
    new NJ();
  }

}
