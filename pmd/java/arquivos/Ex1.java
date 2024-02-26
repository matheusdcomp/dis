package arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex1 {

	public static void main(String[] args) throws IOException {
		
		Path dirAtual = Paths.get(".");
		
		System.out.println("Caminho absoluto: " +
			dirAtual.toAbsolutePath());
		
		Path arq = Paths.get(dirAtual + "\\teste.txt");
		if (!Files.exists(arq))
			Files.createFile(arq);
		
		Path subDir = Paths.get(dirAtual + "\\arquivo");
		if (!Files.exists(subDir))
			Files.createDirectory(subDir);
		
		Files.copy(arq, Paths.get(subDir + "\\teste.txt"));
		
		Files.deleteIfExists(arq);
		
	}

}
