package clp.java.concorrente.q3;

import java.util.LinkedList;
import java.util.Queue;

public class FilaImpressao {

	private Queue<String> fila = new LinkedList<>();
	private int disponivel = 3;

	public synchronized void add(int id, String arquivo) {
		while (disponivel == 0) {
			try {
				System.out.println("Computador #" + id + " esperando libera��o da impressoa...");
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		fila.add(arquivo);
		System.out.println("Computador #" + id + " enviou o " + arquivo + " para impress�o.");
		disponivel--;
		notifyAll();
	}

	public synchronized void poll(int id) {
		while (disponivel == 3) {
			try {
				System.out.println("Impressora #" + id + " esperado...");
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Impressora #" + id + " imprimiu " + fila.poll());
		disponivel++;
		notifyAll();
	}
}
