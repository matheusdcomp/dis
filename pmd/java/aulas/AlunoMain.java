package aulas;

import java.util.Scanner;

public class AlunoMain {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    Aluno a = new Aluno();
    System.out.print("\nDigite o nome do aluno: ");
    a.setNome(s.next());
    System.out.print("\nDigite a matricula do aluno: ");
    a.setMatricula(s.nextInt());

    System.out.print("\nDigite o nome e a matricula do aluno: ");
    Aluno b = new Aluno(s.next(), s.nextInt());

    System.out.println("Aluno a -> Nome: " + a.getNome() + "\tMatricula: " + a.getMatricula());
    System.out.println("Aluno b -> Nome: " + a.getNome() + "\tMatricula: " + a.getMatricula());
    
    s.close();

  }
}
