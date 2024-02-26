package listas.listaex02.ex2;

public abstract class ContaBancaria {

  protected String cliente;
  protected int numero;
  protected float saldo;

  public ContaBancaria() {
    super();
    this.cliente = "";
    this.numero = 0;
    this.saldo = 0f;
  }

  public ContaBancaria(String cliente, int numero, float saldo) {
    super();
    this.cliente = cliente;
    this.numero = numero;
    this.saldo = saldo;
  }

  public String getCliente() {
    return cliente;
  }

  public int getNumero() {
    return numero;
  }

  public abstract float getSaldo();

  public void setCliente(String cliente) {
    this.cliente = cliente;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public boolean sacar(float valor) {
    if (valor > saldo)
      return false;
    saldo -= valor;
    return true;
  }

  public void depositar(float valor) {
    saldo += valor;
  }

  public String toString() {
    return String.format(
        "\nCliente: %s\nNumero: %d\nSaldo: %.2f",
        cliente, numero, getSaldo());
  }

}