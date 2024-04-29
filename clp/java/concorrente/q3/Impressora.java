package clp.java.concorrente.q3;

public class Impressora extends Thread {

	private int id;
	private FilaImpressao buffer;
	private int consumoTotal;

	public Impressora(int id, FilaImpressao b, int total) {
		this.id = id;
		buffer = b;
		consumoTotal = total;
	}

	public void run() {
		for (int i = 0; i < consumoTotal; i++) {
			buffer.poll(id);
		}
		System.out.println("Impressora #" + id + " concluido!");
	}
}
