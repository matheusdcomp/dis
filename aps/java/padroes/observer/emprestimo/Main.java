package observer.emprestimo;

public class Main {

  public static void main(String[] args) {
    EmprestimoBancario eb = new EmprestimoBancario();
    Jornal j1 = new Jornal("O GLOBO");
    Jornal j2 = new Jornal("A TARDE");
    Jornal j3 = new Jornal("FOLHA DE SAO PAULO");
    Internet i1 = new Internet("SITE DA GLOBO");
    Internet i2 = new Internet("SITE DO SBT");
    Internet i3 = new Internet("SITE DA RECORD");

    eb.registerObserver(j1);
    eb.registerObserver(j2);
    eb.registerObserver(j3);
    eb.registerObserver(i1);
    eb.registerObserver(i2);
    eb.registerObserver(i3);

    eb.setTaxa(9);
  }

}
