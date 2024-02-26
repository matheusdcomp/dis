package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JCalculadora2 extends JFrame {
	
	private double n1, n2;
  private JButton op;
	private JTextField display;
	private JButton btIgual, btSoma, btSubt, btMult, btDivi;

	public JCalculadora2() {
		super("Calculadora");
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		setLayout(new BorderLayout());
		
		display = new JTextField(10);
		display.setFont(new Font("ARIAL", Font.BOLD, 36));
		add(display, BorderLayout.NORTH);
		
		JPanel pBotoes = new JPanel();
		pBotoes.setLayout(new FlowLayout());
		add(pBotoes, BorderLayout.CENTER);
		
		btSoma = new JButton("+");
		btSoma.setPreferredSize(new Dimension(150,50));
		btSoma.setFont(new Font("ARIAL", Font.BOLD, 36));
		pBotoes.add(btSoma);
		btSoma.addActionListener(new OPListener(btSoma));
		
		btSubt = new JButton("-");
		btSubt.setPreferredSize(new Dimension(150,50));
		btSubt.setFont(new Font("ARIAL", Font.BOLD, 36));
		pBotoes.add(btSubt);
		btSubt.addActionListener(new OPListener(btSubt));
		
		btMult = new JButton("x");
		btMult.setPreferredSize(new Dimension(150,50));
		btMult.setFont(new Font("ARIAL", Font.BOLD, 36));
		pBotoes.add(btMult);
		btMult.addActionListener(new OPListener(btMult));
		
		btDivi = new JButton("/");
		btDivi.setPreferredSize(new Dimension(150,50));
		btDivi.setFont(new Font("ARIAL", Font.BOLD, 36));
		pBotoes.add(btDivi);
		btDivi.addActionListener(new OPListener(btDivi));
		
		btIgual = new JButton("=");
		btIgual.setPreferredSize(new Dimension(310,50));
		btIgual.setFont(new Font("ARIAL", Font.BOLD, 36));
		pBotoes.add(btIgual);
		btIgual.addActionListener(new IgualListener());
		
	}
	
	public static void main(String[] args) {
		JCalculadora2 j = new JCalculadora2();
		j.setVisible(true);
	}
	
  //Classe interna
  class OPListener implements ActionListener {

    private JButton bop; 

    public OPListener(JButton bop) {
      this.bop = bop; 
    }

    public void actionPerformed(ActionEvent e) { 
      op = bop;
      n1 = Double.parseDouble(display.getText());
      display.setText("");
      display.requestFocus();
    }
    
  }

  //Classe interna
  class IgualListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
      
      n2 = Double.parseDouble(display.getText());
      double rs = 0;
      
      if (op == btSoma) 
        rs = Calculadora.soma(n1, n2);
      
      else if (op == btSubt) 
        rs = Calculadora.subt(n1, n2);
      
      else if (op == btMult) 
        rs = Calculadora.mult(n1, n2);
      
      else if (op == btDivi) 
        rs = Calculadora.divi(n1, n2);
      
      display.setText(rs+"");
    }
    
  }

}
