/*
 * Escreva um programa que cont�m a classe Circulo, 
 * com o atributo raio, e a classe Retangulo,
 * com os atributos l1 e l2. Crie em cada classe um m�todo
 * que calcula e retorna a �rea.
 * Crie uma classe com
 * o m�todo main que pergunta ao usu�rio se
 * ele quer um c�rculo ou um ret�ngulo e depois
 * solicitar os valores dos atributos e calcular
 * a �rea.
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
