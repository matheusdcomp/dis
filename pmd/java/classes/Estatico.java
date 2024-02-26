package classes;

public class Estatico {
	
	static int e;// = 1;
	
	public Estatico() {
		e++;
	}

	public static void main(String[] args) {
		System.out.println("Nenhum objeto criado. Valor de e: " + Estatico.e);;
		Estatico e1 = new Estatico();
		Estatico e2 = new Estatico();
		System.out.println("Dois objetos criados e vivos. Valor de e: " + Estatico.e);
		e1 = e2 = null;
		System.gc();
		System.out.println("Dois objetos criados e nenhum vivo. Valor de e: " + Estatico.e);
		Estatico e3 = new Estatico();
		System.out.println("Tres objetos criados e um vivo. Valor de e: " + Estatico.e);;
	}

}
