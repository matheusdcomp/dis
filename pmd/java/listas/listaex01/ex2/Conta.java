package listas.listaex01.ex2;

import java.util.Scanner;

public class Conta {

  private int numero;
  private double saldo;

  public Conta(int numero, double saldo) {
    this.numero = numero;
    this.saldo = saldo;
  }

  public int getNumero() {
    return numero;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

}