package avancado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Carro implements Comparable<Carro> {
  
  private int id;
  private String nome;
  private double valor;

  public Carro(int id, String nome, double valor) {
    super();
    this.id = id;
    this.nome = nome;
    this.valor = valor;
  }

  public int getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public double getValor() {
    return valor;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  @Override
  public String toString() {
    return String.format(
      "Id: %d, Nome: %s, Valor: %.2f", 
      this.id,
      this.nome,
      this.valor
    );
  }

  public int compareTo(Carro c) {
    int r = this.id - c.id;
    if (r != 0) return r;
    r = this.nome.compareTo(c.nome);
    if (r != 0) return r;
    return (int) (this.valor - c.valor);

    //return (this.id - c.id) + 
    //  (this.nome.compareTo(c.nome)) +
    //  ((int) (this.valor - c.valor));
  }

  public static Comparator<Carro> getComparatorId() {
    return new Comparator<Carro>() {
      public int compare(Carro a, Carro b) {
        return a.id - b.id;
      }
    };
  }

  public static Comparator<Carro> getComparatorNome() {
    return new Comparator<Carro>() {
      public int compare(Carro a, Carro b) {
        return a.nome.compareTo(b.nome);
      }
    };
  }

  public static Comparator<Carro> getComparatorValor() {
    return new Comparator<Carro>() {
      public int compare(Carro a, Carro b) {
        return (int) (a.valor - b.valor);
      }
    };
  }

  public boolean equals(Object obj) {
    if (obj == null) return false;
    if (obj.getClass() != this.getClass()) return false;
    Carro c = (Carro) obj;
    return this.id == c.id &&
      this.nome.equals(c.nome) &&
      this.valor == c.valor;
  }

  public static void main(String[] args) {

    List<Carro> ls = new ArrayList<>();
    ls.add(new Carro(3,"A",100.0));
    ls.add(new Carro(2,"B",300.0));
    ls.add(new Carro(1,"C",200.0));
    ls.add(new Carro(1,"B",200.0));
    ls.add(new Carro(1,"C",400.0));

    System.out.println();

    Collections.sort(ls);
    for (Carro c: ls)
      System.out.println(c);

    System.out.println();

    Collections.sort(ls, Carro.getComparatorId());
    for (Carro c: ls)
      System.out.println(c);

    System.out.println();
    
    Collections.sort(ls, Carro.getComparatorNome());
    for (Carro c: ls)
      System.out.println(c);

    System.out.println();
    
    Collections.sort(ls, Carro.getComparatorValor());
    for (Carro c: ls)
      System.out.println(c);

    ls.forEach((c) -> System.out.println(c));
    Object[] l2 =  ls.stream().map((c) -> c.id * 2).toArray();
    Object[] l3 =  ls.stream().filter((c) -> c.nome.startsWith("A")).toArray();
    

    System.out.println();

    if (new Carro(1,"a",0).equals(new Carro(1,"a",0)))
      System.out.println("Os dois carros são iguais.");
    
  }

}
