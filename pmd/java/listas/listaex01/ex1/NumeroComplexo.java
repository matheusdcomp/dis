package listas.listaex01.ex1;

public class NumeroComplexo {

  private double a, b;

  public NumeroComplexo() {
    this.a = this.b = 0.0;
  }

  public NumeroComplexo(double a, double b) {
    this.a = a;
    this.b = b;
  }

  public NumeroComplexo soma(NumeroComplexo that) {
    NumeroComplexo nc = new NumeroComplexo(); // usando construtor sem argumentos
    nc.a = this.a + that.a;
    nc.b = this.b + that.b;
    return nc;
  }

  public NumeroComplexo produto(NumeroComplexo that) {
    return new NumeroComplexo( // usando construtor com argumentos
        this.a * that.a - this.b * that.b,
        this.b * that.a + this.a * that.b);
  }

  public NumeroComplexo conjugado() {
    return new NumeroComplexo(a, -b);
  }

  public String toString() {
    return a + " + " + b + "i";
  }
}