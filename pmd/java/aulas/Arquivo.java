package aulas;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Arquivo {

  public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     System.out.print("Digite um texto: ");
     String conteudo = sc.nextLine();

     try {
      FileWriter fw = new FileWriter("arquivo.txt");
      fw.append(conteudo);
      fw.close();
     }
     catch (IOException e) {
      e.printStackTrace();
     }

     try {
      FileReader fr = new FileReader("arquivo.txt");
      StringBuilder sb = new StringBuilder();
      int c;
      while (true) {
        c = fr.read();
        if (c == -1) break;
        sb.append((char)c);
      }
      System.out.println(sb);
      fr.close(); 
    }
    catch (FileNotFoundException e) {
      System.err.println("Arquivo não encontrado.");
    }   
    catch (IOException e) {
      e.printStackTrace();
    } 
     
    sc.close();
  }
  
}
