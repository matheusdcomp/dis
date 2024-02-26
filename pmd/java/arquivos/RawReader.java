package arquivos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class RawReader {
	
	public static final int TAM_RAW = 128;

	public static void main(String[] args) {

		criaArquivoRaw();
		
		int [][] rawbytes = leArquivoRaw();
		
		int [] tons_cinza = new int[256]; //Obs: não são só 50
		
		for (int i = 0; i < TAM_RAW; i++) 
			for (int j = 0; j < TAM_RAW; j++)
				tons_cinza[ rawbytes[i][j] ]++;
		
		for (int i = 0; i < 256; i++)
			System.out.println("Tom " + i + ": " + tons_cinza[i]);

	}
	
	public static void criaArquivoRaw() {
		
		try {			
			Path path = Paths.get("arquivos\\teste.raw");
			
			if (Files.notExists(path))
				Files.createFile(path);
			
			FileOutputStream fos = new FileOutputStream(path.toFile());
			
			for (int i = 0; i < TAM_RAW; i++) 
				for (int j = 0; j < TAM_RAW; j++)
					fos.write(new Random().nextInt(256)); //escreve no arquivo um número aleatório entre 0 e 255
			
			fos.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static int[][] leArquivoRaw() {
		
		int[][] rawbytes = new int[TAM_RAW][TAM_RAW];
		
		try {			
			Path path = Paths.get("arquivos\\teste.raw");
			
			FileInputStream fis = new FileInputStream(path.toFile());			
			
			for (int i = 0; i < TAM_RAW; i++) 
				for (int j = 0; j < TAM_RAW; j++)
					rawbytes[i][j] = fis.read();
			
			fis.close();			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return rawbytes;
		
	}

}
