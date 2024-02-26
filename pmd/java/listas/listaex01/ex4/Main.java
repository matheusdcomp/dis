package listas.listaex01.ex4;

import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Main {

  private List<Aluno> alunos;
  private List<Disciplina> disciplinas;
  private List<Matricula> matriculas;

  public Main() {
    alunos = new ArrayList<>();
    disciplinas = new ArrayList<>();
    matriculas = new ArrayList<>();
  }

  public void addAluno(Aluno aluno) {
    alunos.add(aluno);
  }

  public void addDisciplina(Disciplina disciplina) {
    disciplinas.add(disciplina);
  }

  public void addMatricula(Matricula matricula) {
    matriculas.add(matricula);
  }

  public Aluno buscarAluno(int registro) {
    for (Aluno a : alunos)
      if (a.getRegistro() == registro)
        return a;
    return null;
  }

  public Disciplina buscarDisciplina(int codigo) {
    for (Disciplina d : disciplinas)
      if (d.getCodigo() == codigo)
        return d;
    return null;
  }

  public Matricula buscarMatricula(int numero) {
    for (Matricula m : matriculas)
      if (m.getNumero() == numero)
        return m;
    return null;
  }

  public static void main(String[] args) {

    Main main = new Main();
    Matricula m = new Matricula();
    Scanner scn = new Scanner(System.in);

    while (true) {

      System.out.print(
          "\n0 - SAIR" +
              "\n1 - CADASTRAR ALUNO" +
              "\n2 - CADASTRAR DISCIPLINA" +
              "\n3 - REALIZAR MATRICULA" +
              "\n4 - VISUALIZAR MATRICULA" +
              "\nINFORME A SUA OPÇÃO: ");

      int op = scn.nextInt();

      switch (op) {

        case 0:
          scn.close();
          return;

        case 1:
          System.out.print("\nINFORME O REGISTRO E O NOME DO ALUNO: ");
          main.addAluno(
              new Aluno(
                  scn.nextInt(),
                  scn.next()));
          break;

        case 2:
          System.out.print("\nINFORME O CÓDIGO, NOME E VALOR DA DISCIPLINA: ");
          main.addDisciplina(
              new Disciplina(
                  scn.nextInt(),
                  scn.next(),
                  scn.nextFloat()));
          break;

        case 3:

          m = new Matricula();

          System.out.print("\nINFORME O NÚMERO DA MATRÍCULA: ");
          m.setNumero(scn.nextInt());

          Aluno a = null;
          while (a == null) {
            System.out.print("\nINFORME O REGISTRO DO ALUNO: ");
            int registro = scn.nextInt();
            a = main.buscarAluno(registro);
            if (a == null)
              System.out.println("\nNÃO EXISTE ALUNO COM O REGISTRO " + registro);
            else
              m.setAluno(a);
          }

          while (true) {
            System.out.print("\nINFORME O CODIGO DA DISCIPLINA OU 0 PARA PARAR: ");
            int codigo = scn.nextInt();
            if (codigo == 0)
              break;
            Disciplina d = main.buscarDisciplina(codigo);
            if (d == null)
              System.out.println("\nNÃO EXISTE DISCIPLINA COM O CÓDIGO " + codigo);
            else
              m.getDisciplinas().add(d);
          }

          main.addMatricula(m);
          break;

        case 4:
          System.out.print("\nINFORME O NÚMERO DA MATRÍCULA: ");
          int numero = scn.nextInt();
          m = main.buscarMatricula(numero);
          if (m == null)
            System.out.println("\nNÃO EXISTE MATRÍCULA COM O NÚMERO " + numero);
          else
            System.out.println(m);
      }
    }
  }

}
