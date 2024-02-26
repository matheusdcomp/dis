package clp.concorrente;

public class Consumidor extends Thread {
	
	private int id;
	private Buffer buffer;
	private int consumoTotal;

	public Consumidor(int id, Buffer b, int total) {
		this.id = id;
		buffer = b;
		consumoTotal = total;
	}

	public void run() {
		for (int i = 0; i < consumoTotal; i++) {
			buffer.get(id);
		}
		System.out.println("Consumidor #" + id + " concluido!");
	}
}
