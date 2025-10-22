package arquivos;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplo04 {

	public static void main(String[] args) {

		Path path = Paths.get("newfile.txt");
		FileInputStream fis;
		 
		try {
			
			if (!Files.exists(path))
 				Files.createFile(path);	
			
			fis = new FileInputStream(path.toFile());
 
			System.out.println("Total file size to read (in bytes) : " + fis.available());
 
			int content;
			while ((content = fis.read()) != -1) {
				System.out.print((char) content);
			}			
		  fis.close();
			 
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
