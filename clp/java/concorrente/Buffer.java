package clp.concorrente;

public class Buffer {

	private int conteudo;
	private boolean disponivel;

	public synchronized void set(int id, int valor) {
		while (disponivel) {
			try {
				System.out.println("Produtor #" + id + " esperando...");
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		conteudo = valor;
		System.out.println("Produtor #" + id + " colocou " + conteudo);
		disponivel = true;
		notifyAll();
	}

	public synchronized int get(int id) {
		while (!disponivel) {
			try {
				System.out.println("Consumidor #" + id	+ " esperado...");
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Consumidor #" + id + " consumiu: " + conteudo);
		disponivel = false;
		notifyAll();
		return conteudo;
	}
}
