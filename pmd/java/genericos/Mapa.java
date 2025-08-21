package genericos;

import java.util.ArrayList;
import java.util.List;

public class Mapa<K, E> {

	private List<K> chaves;
	private List<E> elementos;

	public Mapa() {
		chaves = new ArrayList<K>();
		elementos = new ArrayList<E>();
	}

	public void add(K chave, E elemento) {
		chaves.add(chave);
		elementos.add(elemento);
	}

	public E rem(K chave) {
		for (int i = 0; i < chaves.size(); i++)
			if (chave.equals(chaves.get(i))) {
				chaves.remove(i);
				E elemento = elementos.remove(i);
				return elemento;
			}
		return null;
	}

	public String toString() {
		var sb = new StringBuilder();
		for (int i = 0; i < chaves.size(); i++)
			sb.append("(" + chaves.get(i) + ", " + elementos.get(i) + ")\n");
		return sb.toString();
	}

	public static void main(String[] args) {
		var mapa = new Mapa<Integer, String>();
		mapa.add(1, "JOAO");
		mapa.add(2, "JOSE");
		mapa.add(3, "ANNA");
		System.out.println(mapa);
	}

}
