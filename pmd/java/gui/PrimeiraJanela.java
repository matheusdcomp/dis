package gui;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class PrimeiraJanela extends JFrame {

	private static final long serialVersionUID = -5954205138197563420L;

	public PrimeiraJanela() {
		
		setSize(400, 300);
		setTitle("Minha primeira janela");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JButton bt = new JButton("OK");
		add(bt);
		
		JTextField tf = new JTextField("Digite aqui");
		tf.setFont(new Font("Times", Font.BOLD, 28 ));
		add(tf);
		
	}
	
	

	public static void main(String[] args) {
		PrimeiraJanela j = new PrimeiraJanela(); 
		j.setVisible(true);

	}

}
