package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestaFinally {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
		  System.out.print("Digite um c�digo ASCII: ");
		  int x = s.nextInt();
		  System.out.printf("Char: %c", (char) x );
		}
		catch (InputMismatchException e) {  
			System.err.println("Isso n�o � um c�digo ASCII.");
		}
		finally {
		  s.close();
		}
	}

}
