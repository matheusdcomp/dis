package aulas;

import java.util.List;

import pmd.java.exercicios.listaex01.ex4.Aluno;
import pmd.java.exercicios.listaex01.ex4.Disciplina;

import java.util.ArrayList;

public class Matricula {

  private int num;
  private Aluno aluno;
  private List<Disciplina> disciplinas;

  public Matricula(int num, Aluno aluno) {
    this.num = num;
    this.aluno = aluno;
    this.disciplinas = new ArrayList<>();
  }

  public int getNum() {
    return num;
  }

  public Aluno getAluno() {
    return aluno;
  }

  public List<Disciplina> getDisciplinas() {
    return disciplinas;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public void setAluno(Aluno aluno) {
    this.aluno = aluno;
  }

  public void setDisciplinas(List<Disciplina> disciplinas) {
    this.disciplinas = disciplinas;
  }

  public String toString() {
    String s = "Numero: " + num + "\nAluno: " + aluno.getNome();
    for (Disciplina d : disciplinas)
      s += "\nDisciplina: " + d.getNome();
    return s;
  }

  public void addDisciplina(Disciplina disciplina) {
    disciplinas.add(disciplina);
  }  

  public void remDisciplina(Disciplina disciplina) {
    for (int i = 0; i < disciplinas.size(); i++) 
      if (disciplinas.get(i).getNome().equals(disciplina.getNome()))
        disciplinas.remove(i);
  }      

  public void remDisciplinaPorNome(String nome) {
    for (Disciplina d : disciplinas) 
      if (d.getNome().equals( nome))
        disciplinas.remove(d);
  }
            
}