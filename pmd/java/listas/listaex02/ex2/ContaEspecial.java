package listas.listaex02.ex2;

public class ContaEspecial extends ContaBancaria {

  protected float limite;

  public ContaEspecial() {
    super();
    this.limite = 0f;
  }

  public ContaEspecial(String cliente, int numero, float saldo, float limite) {
    super(cliente, numero, saldo);
    this.limite = limite;
  }

  public float getLimite() {
    return limite;
  }

  public void setLimite(float limite) {
    this.limite = limite;
  }

  @Override
  public float getSaldo() {
    return saldo;
  }

  @Override
  public boolean sacar(float valor) {
    if (valor > saldo + limite)
      return false;
    saldo -= valor;
    return true;
  }

  @Override
  public String toString() {
    return String.format(
        "%s\nLimite: %.2f",
        super.toString(), limite);
  }

}
