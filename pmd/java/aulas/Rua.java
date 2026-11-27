package aulas;

import java.io.Serializable;
import java.util.Scanner;

public class Rua {


  private final int Q = 10;
  private Casa[] casas = new Casa[Q];

  public Rua() {
    for (int i = 0; i < Q; i++) {
      if (i % 2 == 0)
        casas[i] = new Casa(new Pacote<Integer>(i));
      else 
        casas[i] = new Casa();
    }
  }

  void mensagem(int a, int b) {
    Pacote<? extends Serializable> p = null;
    try { 
      p = casas[a].entregar();          
      casas[b].receber(p);
    } catch (CasaVaziaException e) {
      System.err.println(e.getMessage());
      System.err.println("A mensagem não foi enviada.");
    } catch (CasaCheiaException e) {
      System.err.println(e.getMessage());
      System.err.println("A mensagem não foi enviada.");
      casas[a].setPacote(p);
    }
  }

  public void print() {
    for (int i = 0; i < Q; i++) {
      System.out.printf("[%d]: %s\n", i, casas[i]);
    }
  }

  public static void main(String[] args) {

    int op = 0;
    Scanner s = new Scanner(System.in);
    Rua rua = new Rua();

    while (true) {
      System.out.println("\n0 SAIR\n1 ENVIAR\n2 VER");
      System.out.print("\nOpção: ");
      op = s.nextInt();
      switch (op) {
        case 0:
          s.close();
          System.exit(0);          
        case 1:
          System.err.print("Informe o nro de quem vai enviar e quem vai receber: ");
          rua.mensagem(s.nextInt(), s.nextInt());
          break;
        case 2:
          rua.print();
      }
    }
  }
  
}
