package classes;

import java.util.Scanner;

public class Pessoa {

  private int idade;
  private String nome;

  public Pessoa() {
    this.idade = 0;
    this.nome = "";
  }

  public Pessoa(int idade, String nome) {
    this.idade = idade;
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public String getNome() {
    return nome;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Pessoa p = new Pessoa();
    Pessoa x = new Pessoa(15, "Maria");

    p.idade = scanner.nextInt();
    p.nome = scanner.next();

    System.out.printf("%s\n%s\n", p.nome, x.nome);

    scanner.close();
  }

}