package genericos;

import java.io.Serializable;

import heranca.Pessoa;
import heranca.PessoaFisica;

public class Mapa <K, E> {
	
	private K[] chaves;
	private E[] elementos;

	public static void main(String[] args) {
		Mapa<String, Integer> m = new Mapa<>();
	}

}
