package classes;

public class UsaPessoa {
  public static void main(String[] args) {

    Pessoa p = new Pessoa();
    Pessoa x = new Pessoa(15, "Maria");
    p.setIdade(40);
    p.setNome("Matheus");

    System.out.printf("%s\n%s\n", p.getNome(), x.getNome());

  }
}
