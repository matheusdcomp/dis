package listas.listaex02.ex2;

public class ContaPoupanca extends ContaBancaria {

  protected float rendimento;

  public ContaPoupanca() {
    super();
    this.rendimento = 0f;
  }

  public ContaPoupanca(String cliente, int numero, float saldo, float rendimento) {
    super(cliente, numero, saldo);
    this.rendimento = rendimento;
  }

  public float getRendimento() {
    return rendimento;
  }

  public void setRendimento(float rendimento) {
    this.rendimento = rendimento;
  }

  @Override
  public float getSaldo() {
    saldo *= 1 + rendimento;
    return saldo;
  }

  @Override
  public String toString() {
    return String.format(
        "%s\nTaxa de Rendimento: %.2f",
        super.toString(), rendimento);
  }

}
