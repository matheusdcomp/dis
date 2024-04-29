package clp.java.concorrente;

public class Corredor extends Thread {

	private int id;

	public Corredor(int id) {
		this.id = id;
	}

	public int getMeuId() {
		return id;
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Corredor " + id + " valor: " + i);
		}
	}

}