package aulas;

import java.util.Scanner;

public class VendaMain {

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
            System.out.println("Digite o nome e o valor do produto: ");
            nome = sc.next();
            System.out.println("Digite o valor do produto: ");
            valor = sc.nextFloat();
            venda.addProduto(new Produto(nome, valor));
            System.out.println("Deseja comprar outro produto (S/N)?");
            String continua = sc.next();
            if (continua.equalsIgnoreCase("n")) break;
          }
          System.out.println("\n\n" + venda);
      }
    }
  }
  
}
