package strategy.selva;

public class AtacarEmBando implements Estrategia {

  @Override
  public void acaoInicial() {
    System.out.println("Formar bando com outros leopardos");
    System.out.println("Separar um bis�o da manada");
  }

  @Override
  public void acaoFinal() {
    System.out.println("Atacar em conjunto.");
    System.out.println("Derrubar bis�o.");
    System.out.println("Morder o pesco�o.");
  }

}
