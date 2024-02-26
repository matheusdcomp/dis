package clp.concorrente;

import java.util.Random;

public class AcessoSimultaneo implements Runnable {

	private Vetor dados;
	private int num; 
	
	public AcessoSimultaneo(Vetor dados, int num) {
		this.dados = dados;
		this.num = num;
	}
	
	public void run() {
		try {
			for (int i = 1; i < 10; i++) {
				Thread.sleep(new Random().nextInt(2)*1000);
				dados.set(num, i);
			} 			
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}			
	
	public static void main(String[] args) throws InterruptedException {	
		Vetor dados = new Vetor();
		Thread t1 = new Thread( new AcessoSimultaneo(dados, 1) );
		
		Thread t2 = new Thread( new AcessoSimultaneo(dados, 2) ); 
	
		Thread t3 = new Thread( new AcessoSimultaneo(dados, 3) ); 

		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		for (int v : dados.get())
			System.out.print(v + "  ");
	}

}

class Vetor {	

	private int[] valores = new int[10];
	
	public Vetor () {
		for (int i = 0; i < 10; i++)
			valores[i] = 0;
	}
	
	public  void set(int v, int i) {
		valores[i] = v;		
	}
	
	public  int[] get() {
		return valores;
	}
	
}
