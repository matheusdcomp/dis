package observer.emprestimo;

public class Internet implements Observer {

  private String nome;

  public Internet(String nome) {
    this.nome = nome;
  }

  @Override
  public void update(float taxa) {
    System.out.println(nome + ": A nova taxa de juros � de " + taxa + "%.");
  }

}