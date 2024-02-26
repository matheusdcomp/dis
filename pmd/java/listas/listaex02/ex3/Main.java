package listas.listaex02.ex3;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

    List<Geometria> figuras = new ArrayList<>();
    Scanner scn = new Scanner(System.in);

    while (true) {

      System.out.print(
          "\n0 - FECHAR PROGRAMA" +
              "\n1 - CRIAR CIRCULO" +
              "\n2 - CRIAR RENTAGULO" +
              "\n3 - IMPRIMIR FIGURAS" +
              "\nINFORME A SUA OPÇÃO: ");

      int op = scn.nextInt();

      switch (op) {

        case 0:
          return;

        case 1:
          System.out.print("\nINFORME O RAIO DO CÍRCULO: ");
          figuras.add(new Circulo(scn.nextDouble()));
          break;

        case 2:
          System.out.print("\nINFORME A BASE E A ALTURA DO RETÂNGULO: ");
          figuras.add(new Retangulo(scn.nextDouble(), scn.nextDouble()));
          break;

        case 3:
          for (Geometria f : figuras) {
            System.out.println(f.toString());
          }
      }
    }
  }
}
