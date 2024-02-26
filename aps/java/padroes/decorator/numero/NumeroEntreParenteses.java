package decorator.numero;

public class NumeroEntreParenteses extends NumeroDecorator {

  public NumeroEntreParenteses(Numero numero) {
    super(numero);
  }

  public void imprimir() {
    System.out.print("(");
    numero.imprimir();
    System.out.print(")");
  }

}
