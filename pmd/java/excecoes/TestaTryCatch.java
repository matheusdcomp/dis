package excecoes;

import java.util.Scanner;

public class TestaTryCatch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Digite dois numeros: ");
		String x = s.next();
		String y = s.next();
		s.close();
		int a=0,b=1,d=0;
		try {
			a = Integer.parseInt(x);
			b = Integer.parseInt(y);		
			d = a / b;
			System.out.printf("%d / %d = %d", a, b, d);
		}
		catch (NumberFormatException e) {
			System.out.println("Voc� n�o digitou um n�mero inteiro.");
		}
		catch (ArithmeticException e) {
			System.out.println("Divis�o por 0.");
		}
		catch (Exception e) {
			System.out.println("Exe�e��o gen�rica.");
		}
	}

}
