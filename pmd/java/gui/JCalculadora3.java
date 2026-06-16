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

public class JCalculadora3 extends JFrame {

	private double n1, n2, rs;
	private JButton op;
	private JTextField display;
	private JButton btIgual, btSoma, btSubt, btMult, btDivi;

	public JCalculadora3() {
		super("Calculadora");
		setSize(400, 300);
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
		btSoma.setPreferredSize(new Dimension(150, 50));
		btSoma.setFont(new Font("ARIAL", Font.BOLD, 36));
		pBotoes.add(btSoma);
		btSoma.addActionListener((ActionEvent e) -> operacao(btSoma));

		btSubt = new JButton("-");
		btSubt.setPreferredSize(new Dimension(150, 50));
		btSubt.setFont(new Font("ARIAL", Font.BOLD, 36));
		pBotoes.add(btSubt);
		btSubt.addActionListener((ActionEvent e) -> operacao(btSubt));

		btMult = new JButton("x");
		btMult.setPreferredSize(new Dimension(150, 50));
		btMult.setFont(new Font("ARIAL", Font.BOLD, 36));
		pBotoes.add(btMult);
		btMult.addActionListener((ActionEvent e) -> operacao(btMult));

		btDivi = new JButton("/");
		btDivi.setPreferredSize(new Dimension(150, 50));
		btDivi.setFont(new Font("ARIAL", Font.BOLD, 36));
		pBotoes.add(btDivi);
		btDivi.addActionListener((ActionEvent e) -> operacao(btDivi));

		btIgual = new JButton("=");
		btIgual.setPreferredSize(new Dimension(310, 50));
		btIgual.setFont(new Font("ARIAL", Font.BOLD, 36));
		pBotoes.add(btIgual);
		btIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n2 = Double.parseDouble(display.getText());
				if (op == btSoma)
					rs = Calculadora.soma(n1, n2);
				else if (op == btSubt)
					rs = Calculadora.subt(n1, n2);
				else if (op == btMult)
					rs = Calculadora.mult(n1, n2);
				else if (op == btDivi)
					rs = Calculadora.divi(n1, n2);
				display.setText(rs + "");
			}
		});

	}

	public void operacao(JButton btOperacao) {
		n1 = Double.parseDouble(display.getText());
		op = btOperacao;
		display.setText("");
		display.requestFocus();
	}

	public static void main(String[] args) {
		JCalculadora3 j = new JCalculadora3();
		j.setVisible(true);
	}

}
