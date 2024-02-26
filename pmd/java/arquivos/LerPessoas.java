package arquivos;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LerPessoas {

	public static void main(String[] args) {
		
		try {
			ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("arquivos\\pessoas.txt"));
			Pessoa p;
			try {
				while( (p = (Pessoa) ois.readObject()) != null ) {
					System.out.println(p);
				}
			}catch(EOFException eof) {
				ois.close();
			}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
