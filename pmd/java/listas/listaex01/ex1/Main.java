package listas.listaex01.ex1;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);

    System.out.print("\nDigite os termos a e b do 1o número complexo: ");
    NumeroComplexo nc1 = new NumeroComplexo(scn.nextDouble(), scn.nextDouble());

    System.out.print("\nDigite os termos a e b do 2o número complexo: ");
    NumeroComplexo nc2 = new NumeroComplexo(scn.nextDouble(), scn.nextDouble());

    scn.close();

    System.out.printf("\n(%s) + (%s) = (%s)", nc1, nc2, nc1.soma(nc2));
    System.out.printf("\n(%s) * (%s) = (%s)", nc1, nc2, nc1.produto(nc2));
    System.out.printf("\nConjugado de (%s): (%s)", nc1, nc1.conjugado());
    System.out.printf("\nConjugado de (%s): (%s)\n\n", nc2, nc2.conjugado());
  }

}