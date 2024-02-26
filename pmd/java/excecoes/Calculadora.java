package excecoes;

import java.util.Scanner;

public class Calculadora {
	
	public int soma (int a, int b){
		return a + b;
	}
	
	public int sub (int a, int b){
		return a - b;
	}
	
	public int mult (int a, int b){
		return a * b;
	}
	
	public int div (int a, int b) throws ArithmeticException {
			return a / b;
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Calculadora c = new Calculadora();
		while (true) {
			System.out.print(
					"\n0 - sair" +
					"\n1 - soma" +
					"\n2 - subtracao" +
					"\n3 - multiplicacao" +
					"\n4 - divisao" +
					"\nEscolha sua opcao: ");
			int op = s.nextInt();
			
			if (op == 0) break;
			
			System.out.println("\nDigite dois numeros: ");
			int a, b;
			try {
				a = s.nextInt();
				b = s.nextInt();
			}
			catch (Exception e) {
				System.err.println("\nFormato de número inválido.");
				a = 1;
				b = 1;
			}
			
			if (op == 1)
				System.out.println( ""+ c.soma(a,b) );
			
			else if (op == 2)
				System.out.println( ""+ c.sub(a,b) );
			
			else if (op == 3)
				System.out.println( ""+ c.mult(a,b) );
			
			else if (op == 4) {
				try {
					System.out.println( ""+ c.div(a,b) );
				}
				catch (ArithmeticException e) {
					System.err.println("\nDivisão por zero.\n");
				}	
			}
			
		}
		s.close();
	}
	
}
