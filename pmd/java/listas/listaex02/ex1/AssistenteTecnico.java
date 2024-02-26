package listas.listaex02.ex1;

public class AssistenteTecnico extends Assistente {

  protected float bonus;

  public AssistenteTecnico() {
    super();
    this.bonus = 0f;
  }

  public AssistenteTecnico(String nome, String email, int matricula, float bonus) {
    super(nome, email, matricula);
    this.bonus = 0f;
  }

  public float getBonus() {
    return bonus;
  }

  public void setBonus(int bonus) {
    this.bonus = bonus;
  }

  public void exibeDados() {
    super.exibeDados();
    System.out.printf("\nBonus Noturno: %s", bonus);
  }
}
