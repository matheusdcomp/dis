package excecoes;

public class Assercao {
	public static float KelvinToFahrenheit(float temp) {
		assert (temp >= 0) : "Temperatura menor que o zero absoluto";
		return ((temp - 273) * 1.8F) + 32;
	}

	public static void main(String[] args) {
		System.out.println(KelvinToFahrenheit(273));
		System.out.println(KelvinToFahrenheit(-5));
	}
}
