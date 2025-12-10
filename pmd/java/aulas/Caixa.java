package aulas;

public class Caixa<T extends Conteudo> {

  private T conteudo;

  public Caixa(T conteudo) {
    this.conteudo = conteudo;
  }

  public T getConteudo() {
    return conteudo;
  }

  public void setConteudo(T conteudo) {
    this.conteudo = conteudo;
  }

  public String toString() {
    return conteudo.toString() +", volume: " + conteudo.volume();
  }

  public static void main(String[] args) {
    var x = new Caixa<Garrafa>(
      new Garrafa(5, 5, 20, "Agua de côco")); 
    var y = new Caixa<BarraChocolate>(
      new BarraChocolate(5, 15, 2, 50));

    Garrafa i = x.getConteudo();
    BarraChocolate s = y.getConteudo();

    System.out.println(x);
    System.out.println(y);
  }
  
}
