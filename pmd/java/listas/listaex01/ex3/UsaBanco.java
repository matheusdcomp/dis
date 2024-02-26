package listas.listaex01.ex3;

import java.util.Scanner;

public class UsaBanco {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    new BancoInterface(new Banco()).menu(scn);
    scn.close();
  }

}
