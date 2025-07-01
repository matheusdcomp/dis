package aulas;

import java.util.Scanner;

public class Lista<T> {

  private T[] conteudo;
  private int tam;

  public Lista(T[] conteudo) {
    this.conteudo = conteudo;
    this.tam = 0;
  }

  public void add(T valor, int indice) {
    conteudo[indice] = valor;
    if (indice == tam)
      tam++;
  }

  public T rem(int indice) {
    T valor = conteudo[indice];
    conteudo[indice] = null;
    if (indice == tam - 1)
      tam--;
    return valor;
  }

  public String toString() {
    String str = "\n[";
    for (int i = 0; i < tam; i++)
      if (i == tam)
        str += conteudo[i];
      else
        str += (conteudo[i] == null ? "" : conteudo[i]) + ",";
    return str + "]\n";
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    var lista = new Lista<String>(new String[10]);
    while (true) {
      System.out.println(lista);
      System.out.println("\n0 SAIR\n1 ADD\n2 REM");
      switch (scanner.nextInt()) {
        case 0:
          scanner.close();
          return;
        case 1:
          System.out.print("Digite o valor e índice: ");
          lista.add(scanner.next(), scanner.nextInt());
          break;
        case 2:
          System.out.print("Digite o índice: ");
          System.out.println("Removido: " + lista.rem(scanner.nextInt()));
      }
    }
  }

}
