package clp.java.concorrente;

public class MinhaThread implements Runnable {

	private int num;

	public MinhaThread(int num) {
		this.num = num;
	}

	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.println("Thread " +
					num + " imprime o valor " + i);
	}

	public static void main(String[] args) {
		Runnable r1 = new MinhaThread(1);
		Runnable r2 = new MinhaThread(2);
		Runnable r3 = new MinhaThread(3);

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);

		t1.start();
		t2.start();
		t3.start();

	}

}
