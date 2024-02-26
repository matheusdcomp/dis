package listas.listaex04.ex3;

public class Numero implements Comparable<Numero> {

  private String num;

  public Numero(String num) {
    this.num = num;
  }

  public int compareTo(Numero n) {
    return this.num.compareTo(n.num);
  }

  public String getNum() {
    return num;
  }

  public void setNum(String num) {
    this.num = num;
  }

  public String toString() {
    return num;
  }

}
