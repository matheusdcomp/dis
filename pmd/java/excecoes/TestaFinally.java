package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestaFinally {

	public static void funcao() {
		Scanner s = new Scanner(System.in);
		try {
		  System.out.print("Digite um codigo ASCII: ");
		  int x = s.nextInt();
		  System.out.printf("Char: %c", (char) x );		
			
		}
		catch (InputMismatchException e) {  
			System.err.println("Isso nao eh um codigo ASCII.");			
			
		} 
		s.close();
		return;
	}

	public static void main(String[] args) {
		funcao();
	}

}
