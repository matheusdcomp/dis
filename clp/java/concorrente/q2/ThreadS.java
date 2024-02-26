package clp.concorrente.q2;

import java.util.Random;

public class ThreadS extends Thread {
	
	private Conta conta;
	
	public ThreadS(Conta conta) {
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
		conta.saca(v);
		System.out.println(
			"Saque de " + v + " na conta " + conta.getNum());
		
	}

}
