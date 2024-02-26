package listas.listaex03.ex04;

public class ItsNotANumberException extends Exception {

  public ItsNotANumberException(String s) {
    super("\"" + s + "\" n�o � um n�mero.");
  }

}
