package clp.java.concorrente;

import java.util.Random;

public class ATM {

	public static void main(String[] args) throws InterruptedException {

		Conta conta = new Conta();
		Thread[] ts = new Thread[10];
		Random r = new Random(System.currentTimeMillis());

		for (int i = 0; i < 10; i++) {
			if (r.nextInt(1000) % 2 == 0)
				ts[i] = new Saque(conta);
			else
				ts[i] = new Deposito(conta);
			ts[i].start();
		}

	}

}

class Saque extends Thread {

	private Conta conta;

	public Saque(Conta conta) {
		this.conta = conta;
	}

	public void run() {
		synchronized (conta) {
			float s = conta.getSaldo();
			System.out.println(String.format("%10s  %-15s  %10s", hashCode() + "", "INICIO SAQUE", "" + s));
			s = s - 100;
			conta.setSaldo(s);
			System.out.println(String.format("%10s  %-15s  %10s", hashCode() + "", "FIM SAQUE", "" + s));
		}
	}
}

class Deposito extends Thread {

	private Conta conta;

	public Deposito(Conta conta) {
		this.conta = conta;
	}

	public void run() {
		synchronized (conta) {
			float s = conta.getSaldo();
			System.out.println(String.format("%10s  %-15s  %10s", hashCode() + "", "INICIO DEPOSITO", "" + s));
			s = s + 100;
			conta.setSaldo(s);
			System.out.println(String.format("%10s  %-15s  %10s", hashCode() + "", "FIM DEPOSITO", "" + s));
		}
	}
}

class Conta {

	private float saldo = 1000;

	public void setSaldo(float valor) {
		saldo = valor;
	}

	public float getSaldo() {
		return saldo;
	}

}
