package clp.concorrente.q2;

import java.util.Random;

public class ThreadD extends Thread {
	
	private Conta conta;
	
	public ThreadD(Conta conta) {
		this.conta = conta;
	}
	
	public void run() {
		Random r = new Random(System.currentTimeMillis());
		try {
			sleep(r.nextInt(3)*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		double v = r.nextInt(5000);
		conta.deposita(v);
		System.out.println(
			"Dep�sito de " + v + " na conta " + conta.getNum());		
	}
}
