package clp.java.concorrente;

public class TestaCorredor {
	public static void main(String[] args) {

		Corredor p1 = new Corredor(1);
		// Thread t1 = new Thread(p1);

		Corredor p2 = new Corredor(2);
		// Thread t2 = new Thread(p2);

		p1.start();
		p2.start();

	}
}