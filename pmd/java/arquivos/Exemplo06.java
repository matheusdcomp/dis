package arquivos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplo06 {

	public static void main(String[] args) {
		
		try {

			Path path = Paths.get("testeDBS.txt");
			
			if (!Files.deleteIfExists(path)) {
				Files.createFile(path);
			}
	
			DataOutputStream dos = 
				new DataOutputStream(
					new BufferedOutputStream(
						new FileOutputStream(path.toFile())));
			
			String conteudo = "Conteudo do arquivo.";
			dos.writeChars(conteudo);
			dos.close();
			
			DataInputStream dis = 
				new DataInputStream(
					new BufferedInputStream(
						new FileInputStream(path.toFile())));
					
			try {
			    while(true) {
			    	System.out.print( dis.readChar() );
			    }
			}
			catch (EOFException eof) {
				dis.close();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
