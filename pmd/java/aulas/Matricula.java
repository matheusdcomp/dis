package aulas;

import java.util.List;
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

class Disciplina {

  private int ch;
  private String nome;
  private String prof;

  public Disciplina() {
    this.ch = 0;
    this.nome = "";
    this.prof = "";
  }

  public Disciplina(int ch, String nome, String prof) {
    this.ch = ch;
    this.nome = nome;
    this.prof = prof;
  }

  public int getCH() {
    return ch;
  }

  public String getNome() {
    return nome;
  }

  public String getProf() {
    return prof;
  }

  public void setCH(int ch) {
    this.ch = ch;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setProf(String prof) {
    this.prof = prof;
  }

  public String toString() {
    return String.format(
      "{ch: %d, nome: %s, prof: %s}",
      ch, nome, prof
    );
  }
}

class Aluno {

  private int ra;
  private String nome;

  public Aluno() {
    this.ra = 0;
    this.nome = "";
  }

  public Aluno(int ra, String nome) {
    this.ra = ra;
    this.nome = nome;
  }

  public int getRA() {
    return ra;
  }

  public String getNome() {
    return nome;
  }

  public void setRA(int ra) {
    this.ra = ra;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String toString() {
    return String.format(
      "{ra: %d, nome: %s}",
      ra, nome
    );
  }
}

