package clp.java.concorrente.q2;

import java.util.Random;

public class Conta {

	private double saldo;
	private int num;

	public Conta(int num) {
		this.num = num;
		saldo = new Random(
				System.currentTimeMillis()).nextInt(10000);
	}

	public synchronized void atualiza(double taxa) {
		this.saldo *= (1 + taxa);
	}

	public synchronized void saca(double valor) {
		this.saldo -= valor;
	}

	public synchronized void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNum() {
		return num;
	}
}
