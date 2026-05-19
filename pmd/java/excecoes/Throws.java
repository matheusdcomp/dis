package excecoes;

import java.util.Scanner;

public class Throws {

  public void medoto1() throws NumberFormatException, ArithmeticException{
    Scanner s = new Scanner(System.in);
		System.out.print("Digite dois numeros: ");
		String x = s.next();
		String y = s.next();
		s.close();
		int a=0,b=1,d=0;	
		a = Integer.parseInt(x);
		b = Integer.parseInt(y);		
		d = a / b;
		System.out.printf("%d / %d = %d", a, b, d);	
  }

  public static void main(String[] args) {
    try {
      new Throws().medoto1();
    }	catch (NumberFormatException e) {
			System.out.println("Voce nao digitou um numero inteiro.");
		}
		catch (ArithmeticException e) {
			System.out.println("Divisao por 0.");
		}
  }
}
