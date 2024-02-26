package clp.concorrente;

public class TestaThread implements Runnable {
	
	private Dados dados;
	private int num;
	
	public TestaThread(int num, Dados dados) {
		this.num = num;
		this.dados = dados;
	}
	
	@Override
	public  void run() {
		for (int i = 0; i < 10; i++) {
			dados.set(i, num);
			System.out.format("Tread %d escreveu em dados[%d]\n", num, i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		Dados dados = new Dados();		
		
		Thread t1 = new Thread(new TestaThread(1, dados));
		Thread t2 = new Thread(new TestaThread(2, dados));
		Thread t3 = new Thread(new TestaThread(3, dados));
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		for (int i = 0; i < 10; i++)
			System.out.print(dados.get(i) + " ");
		
	}

}

class Dados {
	
	private int[] dados = new int[10];
	
	public Dados() {
		for (int i = 0; i < 10; i++)
			dados[i] = 0;
	}
	
	public synchronized void set(int p, int v) {
		dados[p] = v;	
	}
	
	public synchronized int get(int p) {
		return dados[p];
	}
	
}
