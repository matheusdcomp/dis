package aulas;

public class AlunoMain2 {

  public static void main(String[] args) {
    Aluno a = new Aluno("JOAO", 111);
    Aluno b = new Aluno("JOAO", 111);

    if (a.equals(b) && a.getMatricula() == b.getMatricula() ) 
      System.out.println("Aluno a é o mesmo que o b.");
    else
      System.out.println("Aluno a não é o mesmo que o b.");

    String s1 = new String("abc");
    String s2 = new String("abc");

  }
  
}
