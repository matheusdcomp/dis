package excecoes;

import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResource {
  public static void main(String[] args) {
    try (FileOutputStream output = new FileOutputStream("trywith.txt");) {
      output.write("Olá!".getBytes());
      //não precisa mais fechar o arquivo manualmente
      System.out.println("O texto foi escrito no arquivo.");
    } catch (IOException e) {
      System.out.println("Erro ao escrever no arquivo.");
    }
  }
}
