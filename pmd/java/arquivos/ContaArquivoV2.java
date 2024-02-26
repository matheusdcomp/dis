package arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ContaArquivoV2 {

	public static void main(String[] args) throws Exception {

		Path entrada = Paths.get("arquivos\\entrada.txt");
		Path saida = Paths.get("arquivos\\saida.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(entrada.toString()));
		
		int letras = 0, vogais = 0, consoantes = 0, 
			palavras = 0, linhas = 0;
		String linha;
		
		while( (linha = br.readLine()) != null ) {
			
			for (char ch : linha.toCharArray()) {
			
				if (Character.isLetter(ch)) {
					letras++;
				
					String vgs = "AEIOUaeiou";
					if (vgs.indexOf(ch) >= 0) //indexOf retorna -1 se ch não existir na string
						vogais++;
					else
						consoantes++;
				}
				
			}
			
			palavras += linha.split(" ").length;
			
			linhas++;
		}
		br.close();
		
		if (Files.notExists(saida))
			Files.createFile(saida);
		
		String conteudo = "Letras: " + letras +
				"\nVogais: " + vogais +
				"\nConsoantes: " + consoantes +
				"\nPalavras: " + palavras +
				"\nLinhas: " + linhas;
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(saida.toString()));
		bw.write(conteudo);
		bw.close();
		

	}

}
