package listas.listaex01.ex2;

import java.util.Scanner;

public class UsaConta {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    Conta conta = new Conta(123, 0.0);
    ContaInterface.menu(conta, scn);
    scn.close();
  }

}
