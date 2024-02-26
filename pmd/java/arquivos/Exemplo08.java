package arquivos;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exemplo08 {

	public static void main(String args[]) {

		try {

			Path path = Paths.get("testeSR.txt");

			if (!Files.deleteIfExists(path)) {
				Files.createFile(path);
			}

			FileOutputStream fout = new FileOutputStream(path.toFile(), true);
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			
			oos.writeObject(new Address("a","a"));
			oos.writeObject(new Address("b","b"));
			oos.writeObject(new Address("c","c"));
			oos.writeObject(new Address("d","d"));
			oos.close();
						
			FileInputStream fin = new FileInputStream(path.toFile());
			ObjectInputStream ois = new ObjectInputStream(fin);
			
			Address ad;
			try {
				while (true) {
					ad = (Address) ois.readObject();
					System.out.println(ad);
				}
			}
			catch (EOFException e) {
				ois.close();
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}