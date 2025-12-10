package aulas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProdutoMain {
  public static void main(String[] args) {
    List<Produto> produtos = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("\n\n0 SAIR\n1 CADASTRAR\n2 IMPRIMIR");
      System.out.print("Informe sua opção: ");
      int op = sc.nextInt();
      
      if (op == 0) {
        break;
      }
      else if (op == 1) {
        System.out.print("ID do produto: ");
        int id = sc.nextInt();
        System.out.print("Nome do produto: ");
        String nome = sc.next();
        float valor = -1.0f;
        while (valor <= 0) {
          try {            
            System.out.print("Valor do produto: ");
            valor = sc.nextFloat();
            if (valor <= 0) throw new ValorInvalidoException(valor);
          }
          catch (ValorInvalidoException e) {
            System.err.println(e.getMessage());
          }
        }
        produtos.add(new Produto(id, nome, valor));
      }
      else {
        for (Produto p : produtos)
          System.out.println(p);
      }
    }
    sc.close();
  }  
}

class ValorInvalidoException extends Exception {
  public ValorInvalidoException(float valor) {
    super("Valor inválido para um produto: " + valor);
  }
}