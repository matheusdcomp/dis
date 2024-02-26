package clp.concorrente;

public class TestaProdutorConsumidor {

	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		Produtor produtor1 = new Produtor(1, buffer, 5);
		Produtor produtor2 = new Produtor(2, buffer, 5);
		Consumidor consumidor1 = new Consumidor(1, buffer, 5);
		Consumidor consumidor2 = new Consumidor(2, buffer, 5);

		produtor1.start();
		consumidor1.start();
		produtor2.start();
		consumidor2.start();
	}
}
