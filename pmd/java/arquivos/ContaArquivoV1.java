package arquivos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ContaArquivoV1 {
	
	public static boolean ehVogal(char ch) {
		ch = Character.toUpperCase(ch);
		return ch == 'A' || ch == 'E' || ch == 'I' ||ch == 'O' || ch == 'U';
	}

	public static void main(String[] args) throws Exception {

		Path entrada = Paths.get("arquivos\\entrada.txt");
		Path saida = Paths.get("arquivos\\saida.txt");
		
		FileInputStream fis = new FileInputStream(entrada.toString());
		
		int bt, letras = 0, vogais = 0, consoantes = 0, 
			palavras = 1, linhas = 1; //comecam de 1 porque a última palavra/linha não possui um caracterere em seguida.
		
		while( (bt = fis.read()) != -1 ) {
			
			char ch = (char) bt;
			
			if (Character.isLetter(ch)) {
				letras++;
			
				if ( ehVogal(ch) )
					vogais++;
				else 
					consoantes++;
			}
			else if ( ch == ' ' )
				palavras++;
			
			else if ( ch == '\n' ) {
				linhas++;
				palavras++;
			}
		}
		fis.close();
		
		if (Files.notExists(saida))
			Files.createFile(saida);
		
		String conteudo = "Letras: " + letras +
				"\nVogais: " + vogais +
				"\nConsoantes: " + consoantes +
				"\nPalavras: " + palavras +
				"\nLinhas: " + linhas;
		
		FileOutputStream fos = new FileOutputStream(saida.toString());
		fos.write(conteudo.getBytes());
		fos.close();
		

	}

}
