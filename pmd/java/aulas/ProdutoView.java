package aulas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProdutoView {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    Integer id = inputInteger(s, "Digite o id: ");
    System.out.print("Digite o nome: ");
    String nome = s.next();
    Float valor = inputFloat(s, "Digite o valor: ");

  
    System.out.println(new Produto(id, nome, valor));
    s.close();
    
  }

  public static Integer inputInteger(Scanner s, String msn) {
    while (true) {
      try {
        System.out.print(msn);
        return s.nextInt();
      }
      catch(InputMismatchException e) {
        s.next();
        System.err.println("Você deve digitar um inteiro.");
      }
    }
  }

  public static Float inputFloat(Scanner s, String msn) {
    while (true) {
      try {
        System.out.print(msn);
        return s.nextFloat();
      }
      catch(InputMismatchException e) {
        s.next();
        System.err.println("Você deve digitar um número.");
      }
    }
  }
}