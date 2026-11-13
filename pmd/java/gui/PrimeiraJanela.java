package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class PrimeiraJanela extends JFrame {

	public PrimeiraJanela() {
		
		setTitle("Minha primeira janela");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());

		Font font = new Font("Times", Font.BOLD, 28 );
		
		JButton bt = new JButton("OK");
		bt.setFont(font);
		add(bt);
		
		JTextField tf = new JTextField("Digite aqui");
		tf.setPreferredSize(new Dimension(300,50));
		tf.setFont(font);
		add(tf);
		
	}
	
	

	public static void main(String[] args) {
		PrimeiraJanela j = new PrimeiraJanela(); 
		j.pack();//ajusta o tamanho da janela ao seu conteúdo
		j.setVisible(true);

	}

}
