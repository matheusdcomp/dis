package classes;


public class Estatico {

	private static int qtd = 0;

	public Estatico() {
		qtd++;
	}

	public static void reduzir(int reducao) {
		qtd -= reducao;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {	
		
		System.out.println("Nenhum objeto criados. Quantidade: " + Estatico.qtd);

		Estatico e1 = new Estatico();
		Estatico e2 = new Estatico();
		System.out.println("Dois objetos criados e vivos. Quantidade: " + Estatico.qtd);

		e2 = e1 = null;
		Estatico.reduzir(2);
		System.out.println("Dois objetos criados e nenhum vivo. Quantidade: " + Estatico.qtd);

		Estatico e3 = new Estatico();
		System.out.println("Tres objetos criados e um vivo. Quantidade: " + Estatico.qtd);
	}

}
