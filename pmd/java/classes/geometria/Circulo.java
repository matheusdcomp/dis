/*
 * Escreva um programa que contém a classe Circulo, 
 * com o atributo raio, e a classe Retangulo,
 * com os atributos l1 e l2. Crie em cada classe um método
 * que calcula e retorna a área.
 * Crie uma classe com
 * o método main que pergunta ao usuário se
 * ele quer um círculo ou um retângulo e depois
 * solicitar os valores dos atributos e calcular
 * a área.
 * 
 */

package classes.geometria;

public class Circulo {
	
	private float raio = 4;
	
	public Circulo() {
		raio = 0;
	}
	
	public Circulo(float raio) {
		this.raio = raio;
	}
	
	public float getRaio() {
		return raio;
	}

	public void setRaio(float r) {
		raio = r;
	}

	public float area() {
		 return 3.14F * raio * raio;
	}

}
