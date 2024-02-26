package decorator.numero;

public class Main {

  public static void main(String[] args) {
    Numero numero = new Numero2();
    numero = new NumeroEntreParenteses(numero);
    numero = new NumeroEntreColchetes(numero);
    numero = new NumeroEntreColchetes(numero);
    numero = new NumeroEntreColchetes(numero);
    numero = new NumeroEntreChaves(numero);
    numero.imprimir();
  }

}
