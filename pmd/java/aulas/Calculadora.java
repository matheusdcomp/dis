package aulas;

public class Calculadora {

  private double operando1, operando2;
  private double resultado;
  private char operacao;

  public Calculadora() {
    this.operando1 = 0;
    this.operando2 = 0;
    this.operacao = '+';
    this.resultado = 0;
  }

  public Calculadora(double operando1, double operando2, char operacao) {
    this.operando1 = operando1;
    this.operando2 = operando2;
    this.operacao = operacao;
    calcular();
  }

  public double getOperando1() {
    return operando1;
  }

  public void setOperando1(double operando1) {
    this.operando1 = operando1;
  }

  public double getOperando2() {
    return operando2;
  }

  public void setOperando2(double operando2) {
    this.operando2 = operando2;
  }

  public char getOperacao() {
    return operacao;
  }

  public void setOperacao(char operacao) {
    this.operacao = operacao;
  }

  public double getResultado() {
    return resultado;
  }

  public void setResultado(double resultado) {
    this.resultado = resultado;
  }

  public String toString() {
    return String.format("%.2f %c %.2f = %.2f",
        operando1, operacao, operando2, resultado);
  }

  public void calcular() {
    if (operacao == '+')
      resultado = operando1 + operando2;
    else if (operacao == '-')
      resultado = operando1 - operando2;
    else if (operacao == '*')
      resultado = operando1 * operando2;
    else if (operacao == '/')
      resultado = operando1 / operando2;
  }

}
