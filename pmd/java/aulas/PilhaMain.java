package aulas;

import java.util.Scanner;

public class PilhaMain {

  public static void main(String[] args) {
     Pilha<Integer> p = new Pilha<>();
     Scanner s = new Scanner(System.in);
     int op;
     while(true) {
      System.out.println("\n\n0 SAIR\n1 ADD\n 2 REM\n3 VER\n4 TAM");
      op = s.nextInt();
      switch (op) {
        case 0:
          s.close();
          return;
        case 1:
          System.out.println("Digite um inteiro: ");
          p.add(s.nextInt());
          break;
        case 2:
          if (p.vazia()) System.out.println("Pilha vazia");
          else System.out.println("Removido: " + p.rem());
          break;
        case 3:
          System.out.println(p);
          break;
        case 4:
          System.out.println("Tamanho: " + p.tamanho());
      }
     }
  }
  
}
