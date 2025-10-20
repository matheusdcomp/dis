package aulas;

import java.util.Scanner;

public class VendaMain {

  public static Float entradaFloat(Scanner sc) {
    String entrada = "";
    float valor = 0;
    while (valor == 0) {
      try {
        entrada = sc.next();
        valor = Float.parseFloat(entrada);
        if (valor < 0) throw new NumberFormatException();
      }
      catch (NumberFormatException e) {        
        System.err.println("O valor '" + entrada + "' é inválido.");
        System.out.print("Informe um valor válido para o produto:");
        valor = 0;
      }
    }
    return valor;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Integer opcao;
    while (true) {
      System.out.print("\n\n0 SAIR\n1 VENDA\nDigite sua opção: ");
      opcao = sc.nextInt();
      switch (opcao) {
        case 0:
          sc.close();
          return;//System.exit(0);
      
        case 1:
          Venda venda = new Venda();
          String nome;
          Float valor;
          while(true) {
            System.out.print("Digite o nome do produto: ");
            nome = sc.next();
            System.out.print("Digite o valor do produto: ");
            valor = entradaFloat(sc);
            venda.addProduto(new Produto(nome, valor));
            System.out.print("Deseja comprar outro produto (S/N)?");
            String continua = sc.next();
            if (continua.equalsIgnoreCase("n")) break;
          }
          System.out.println("\n" + venda);
      }
    }
  }
  
}
