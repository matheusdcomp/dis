package arquivos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplo05 {

	public static void main(String args[]) throws IOException {
		
		Path path = Paths.get("testeDS.txt");
		
		if (!Files.deleteIfExists(path)) {
			Files.createFile(path);
		}
		
		FileOutputStream fos = new FileOutputStream(path.toFile());
		DataOutputStream dos = new DataOutputStream(fos);
		
				
		String conteudo = "Conteudo do arquivo.";
		dos.writeChars(conteudo);
		dos.close();
		
		DataInputStream dis = 
			new DataInputStream(
				new FileInputStream(path.toFile()));
				
		try {
		    while(true){
		    	System.out.print( dis.readChar() );
		    }
		}
		catch (EOFException eof) {
			dis.close();		
		}
		
	}

}
