package excecoes;

public class TestaFinallyReturn {
	
	public static void testa() {
		try {
			System.out.println("TRY");
			int a = 5 / 0;
			return;
		} 
		catch (Exception e) {
			System.out.println("CATCH");
			return;
		} 
		finally {
			System.out.println("FINALLY");
		}
	}

	public static void main(String[] args) {
		System.out.println("MAIN INICIO");
		testa();
		System.out.println("MAIN FIM");
	}

}
