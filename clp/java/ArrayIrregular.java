package clp.tipos;

import java.util.Random;

public class ArrayIrregular {

	public static void main(String[] args) {
		
		int[ ][ ] matriz = new int[3][];
        matriz[0] = new int[2];
        matriz[1] = new int[4];
        matriz[2] = new int[3];
        
        for (int i = 0; i < 3; i++) 
        	for (int j = 0; j < matriz[i].length; j++) 
        		matriz[i][j] = new Random().nextInt(100);
        
        for (int i = 0; i < 3; i++) {
        	for (int j = 0; j < matriz[i].length; j++)
        		System.out.print(matriz[i][j] + "  ");
        	System.out.println();
        }
	}

}
