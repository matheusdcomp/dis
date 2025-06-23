package gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Paineis extends JFrame {

  public Paineis() {

    super("Janela que troca paineis");

    var mip1 = new JMenuItem("Painel 1");
    mip1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        getContentPane().removeAll(); // remove todos os componentes adicionados à janela
        add(new Painel1(), BorderLayout.CENTER);
        revalidate(); // Recalcula o layout
        repaint(); // Redesenha a janela
      }
    });

    var mip2 = new JMenuItem("Painel 2");
    mip2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        getContentPane().removeAll();
        add(new Painel2(), BorderLayout.CENTER);
        revalidate();
        repaint();
      }
    });

    var mnps = new JMenu("Painéis");
    mnps.add(mip1);
    mnps.add(mip2);

    var menubar = new JMenuBar();
    menubar.add(mnps);

    setJMenuBar(menubar);
    setSize(800, 600);
    setResizable(false);
    setLayout(new BorderLayout());
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new Paineis().setVisible(true);
  }

}

class Painel1 extends JPanel {
  public Painel1() {
    var rotulo = new JLabel("PAINEL 1");
    rotulo.setFont(new Font("Arial", Font.BOLD, 40));
    setLayout(new BorderLayout());
    add(rotulo, BorderLayout.CENTER);
  }
}

class Painel2 extends JPanel {
  public Painel2() {
    var rotulo = new JLabel("PAINEL 2");
    rotulo.setFont(new Font("Arial", Font.BOLD, 40));
    setLayout(new BorderLayout());
    add(rotulo, BorderLayout.CENTER);
  }
}