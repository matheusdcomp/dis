package classes.geometria;

import java.util.Scanner;

public class UsaGeometria {

	public static void main(String[] args) {

		String op;
		System.out.print("Dejesa a área de um cículo ou de um retângulo: ");
		Scanner s = new Scanner(System.in);
		op = s.nextLine();
		
		if (op.equalsIgnoreCase("circulo")) {
			System.out.print("Digite o raio do círculo: ");
			Circulo circulo = new Circulo(s.nextFloat());
			System.out.println("\nÁrea do círculo: " + circulo.area());
		}
		else if (op.equalsIgnoreCase("retangulo") ) {
			System.out.print("Digite os lados do retângulo: ");
			Retangulo retangulo = new Retangulo();
			retangulo.setL1(s.nextFloat());
			retangulo.setL2(s.nextFloat());
			System.out.println("\nÁrea do retângulo: " + retangulo.area());
		}	
		
		s.close();

	}

}
