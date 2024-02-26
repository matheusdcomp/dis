package clp.tipos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lista {

	public static void main(String[] args) {

		Integer[] vetor = new Integer[10];
		vetor[0] = 5;
		System.out.println(vetor[0]);
		
		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(0,5);
		System.out.println(lista.get(0));
		
		LinkedList<Integer> lista2 = new LinkedList<>();
		lista2.add(0,5);
		System.out.println(lista2.get(0));
		

	}

}
