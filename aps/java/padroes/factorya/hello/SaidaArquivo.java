package factorya.hello;

import java.io.FileOutputStream;

public class SaidaArquivo implements FormatoSaida {

  @Override
  public void saida() {
    try {
      FileOutputStream fos = new FileOutputStream("HelloWorld.txt");
      fos.write("hello World!".getBytes());
      fos.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
