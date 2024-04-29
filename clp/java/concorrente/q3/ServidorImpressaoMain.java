package clp.java.concorrente.q3;

public class ServidorImpressaoMain {

	public static void main(String[] args) {

		FilaImpressao fila = new FilaImpressao();
		Computador computador1 = new Computador(1, fila, 5);
		Computador computador2 = new Computador(2, fila, 5);
		Impressora impressora1 = new Impressora(1, fila, 5);
		Impressora impressora2 = new Impressora(2, fila, 5);

		computador1.start();
		impressora1.start();
		computador2.start();
		impressora2.start();
	}
}
