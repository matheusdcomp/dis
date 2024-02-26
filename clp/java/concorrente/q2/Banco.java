package clp.concorrente.q2;

import java.util.Random;

public class Banco {

	public static void main(String[] args) {
		Conta contas[] = new Conta[5];
		for (int i = 0; i < 5; i++) 
			contas[i] = new Conta(i);
		
		Random r = new Random(System.currentTimeMillis());
		
		for (int i = 0; i < 20; i++) {
			int op = r.nextInt(3);
			if (op == 0) new ThreadA(contas[r.nextInt(5)]).start(); 
			if (op == 1) new ThreadS(contas[r.nextInt(5)]).start(); 
			if (op == 2) new ThreadD(contas[r.nextInt(5)]).start(); 
		}

	}

}
