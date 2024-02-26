package arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplo07 {

	public static void main(String[] args) {

		try {

			Path path = Paths.get("testeBWR.txt");
			
			if (!Files.deleteIfExists(path)) {
				Files.createFile(path);
			}
	
			BufferedWriter writer = 
				new BufferedWriter(
					new FileWriter(path.toString()));
			
			String conteudo = "Conteudo do arquivo.";
			writer.write(conteudo);
			writer.close();
			
			BufferedReader reader = 
				new BufferedReader(
					new FileReader(path.toFile()));
			
			String leitura = "";
			
		    while( (leitura = reader.readLine()) != null )
		    	System.out.println(leitura);
		    
		    reader.close();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}		

	}
}
