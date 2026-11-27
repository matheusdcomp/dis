package aulas;

public class CasaCheiaException extends Exception {

  public CasaCheiaException(String s) {
    super("Esta casa já tem um pacote: " + s);
  }
  
}
