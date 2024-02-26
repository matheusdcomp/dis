package classes.geometria;

import java.util.Scanner;

public class UsaGeometria {

	public static void main(String[] args) {

		String op;
		System.out.print("Dejesa a �rea de um c�culo ou de um ret�ngulo: ");
		Scanner s = new Scanner(System.in);
		op = s.nextLine();
		
		if (op.equalsIgnoreCase("circulo")) {
			System.out.print("Digite o raio do c�rculo: ");
			Circulo circulo = new Circulo(s.nextFloat());
			System.out.println("\n�rea do c�rculo: " + circulo.area());
		}
		else if (op.equalsIgnoreCase("retangulo") ) {
			System.out.print("Digite os lados do ret�ngulo: ");
			Retangulo retangulo = new Retangulo();
			retangulo.setL1(s.nextFloat());
			retangulo.setL2(s.nextFloat());
			System.out.println("\n�rea do ret�ngulo: " + retangulo.area());
		}	
		
		s.close();

	}

}
