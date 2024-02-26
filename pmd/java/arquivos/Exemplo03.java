package arquivos;

import java.io.FileOutputStream;
import java.io.IOException;

public class Exemplo03 {

  public static void main(String[] args) {

    String content = "This is the text content";

    try {

      FileOutputStream fop = new FileOutputStream("newfile.txt");

      byte[] contentInBytes = content.getBytes();

      fop.write(contentInBytes);

      fop.flush();
      fop.close();

      System.out.println("Done");

    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
