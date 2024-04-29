package clp.java.concorrente.q1;

import javax.swing.JOptionPane;

public class Cronometro extends Thread {

	public void run() {
		int t = Integer.parseInt(
				JOptionPane.showInputDialog("Digite o tempo"));

		for (; t >= 0; t--) {
			System.out.println(t);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Cronometro().start();
	}

}
