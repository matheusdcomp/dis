package arquivos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GravaNumeros {

	public static void main(String[] args) {
		try {
			Path arq = Paths.get("numerosFloat.txt");

			ArrayList<Float> floats = new ArrayList<Float>();
			while (true) {
				String numero = JOptionPane.showInputDialog("Digite um numero (0 para sair): ");
				if (numero.equals("0"))
					break;
				floats.add(Float.parseFloat(numero));
			}

			DataOutputStream dos = new DataOutputStream(new FileOutputStream(arq.toString()));
			for (float n : floats)
				dos.writeFloat(n);
			dos.close();
			
			DataInputStream dis = new DataInputStream(new FileInputStream(arq.toString()));
			floats = new ArrayList<Float>();
			try{
				while(true) {
					floats.add( dis.readFloat() );
				}
			}
			catch(EOFException eofe) {
				dis.close();
			}
			for (float n : floats)
				System.out.println(n);
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
