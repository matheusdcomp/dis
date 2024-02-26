package listas.listaex03.ex03;

public class NegativeNumberException extends Exception {

  public NegativeNumberException(int n) {
    super("Número negativo: " + n);
  }

}
