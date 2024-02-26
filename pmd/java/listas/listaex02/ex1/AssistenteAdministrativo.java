package listas.listaex02.ex1;

public class AssistenteAdministrativo extends Assistente {

  protected int turno; // dia = 1, noite = 0
  protected float adicionalNoturno;

  public AssistenteAdministrativo() {
    super();
    this.turno = 1;
    this.adicionalNoturno = 0f;
  }

  public AssistenteAdministrativo(String nome, String email, int matricula, int turno, float adicionalNoturno) {
    super(nome, email, matricula);
    this.turno = 1;
    this.adicionalNoturno = 0f;
  }

  public int getTurno() {
    return turno;
  }

  public float getAdicionalNoturno() {
    return adicionalNoturno;
  }

  public void setTurno(int turno) {
    this.turno = turno;
  }

  public void setAdicionalNoturno(float adicionalNoturno) {
    this.adicionalNoturno = adicionalNoturno;
  }

  public void exibeDados() {
    super.exibeDados();
    System.out.printf(
        "\nTurno: %s\nAdicional Noturno: %.2f",
        turno == 1 ? "dia" : "noite",
        adicionalNoturno);

  }
}
