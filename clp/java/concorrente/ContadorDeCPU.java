package clp.concorrente;

public class ContadorDeCPU {

	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		System.out.println("Quantidade de CPUs: " + rt.availableProcessors());

	}

}
