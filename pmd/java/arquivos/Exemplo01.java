package arquivos;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Exemplo01 {
	
	public static void main(String[] args) {
		
		String separator = FileSystems.getDefault().getSeparator();
		
		Path arq1 = Paths.get("arquivos"+ separator +"Teste.txt"); //passa o caminho completo
		Path arq2 = Paths.get("arquivos", "teste.txt"); //outra forma
		FileSystem fileSystem = FileSystems.getDefault(); //recupera o File System
		Path arq3 = fileSystem.getPath("arquivos"+ separator +"Teste.txt"); //cria o Path
		
		System.out.format("%s é igual a %s? %b%n", arq1, arq2, arq1.compareTo(arq2));
		System.out.format("Nome do arquivo: %s%n", arq1.getFileName());
		System.out.format("1o diretório: %s%n", arq1.getName(0));
		System.out.format("Qtde de elementos no path: %d%n", arq1.getNameCount());
		System.out.format("Diretório do arquivo: %s%n", arq1.getParent());
		System.out.format("String do path: %s%n", arq1.toString());
		System.out.format("Caminho absoluto: %s%n", arq3.toAbsolutePath());
		System.out.println("Separador:" + fileSystem.getSeparator());
		System.out.println(arq3.toAbsolutePath());
		

	}

}
