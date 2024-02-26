package decorator.numero;

public class NumeroEntreColchetes extends NumeroDecorator {

  public NumeroEntreColchetes(Numero numero) {
    super(numero);
  }

  public void imprimir() {
    System.out.print("[");
    numero.imprimir();
    System.out.print("]");
  }

}
