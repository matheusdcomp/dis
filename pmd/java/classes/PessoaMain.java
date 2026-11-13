package classes;

public class PessoaMain {
  public static void main(String[] args) {

    Pessoa p = new Pessoa();
    p.setNome("Matheus");
    p.setIdade(30);
    
    Pessoa x = new Pessoa();
    x.setNome("Maria");
    x.setIdade(20);

    System.out.println("\nNome:" + p.getNome() + "\nIdade: " + p.getIdade());
    System.out.println("\nNome:" + p.getNome() + "\nIdade: " + p.getIdade());

  }
}
