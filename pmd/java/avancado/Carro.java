package avancado;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Carro implements Comparable<Carro> {
  
  private Integer id;
  private String nome;
  private Double valor;

  public Carro(int id, String nome, double valor) {
    super();
    this.id = id;
    this.nome = nome;
    this.valor = valor;
  }

  public Integer getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public Double getValor() {
    return valor;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setValor(Double valor) {
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
        return Double.compare(a.valor, b.valor);
      }
    };
  }

  public static Comparator<Carro> getComparator(String nomeAtributo) {
    return new Comparator<Carro>() {
      public int compare(Carro a, Carro b) {
        try {
          Field at = Carro.class.getDeclaredField(nomeAtributo);
          /* 
          if (at.getType() == Integer.class)
            return at.getInt(a) - at.getInt(b);
          if (at.getType() == Double.class)
            return Double.compare(at.getDouble(a), at.getDouble(b));
          else*/
            return at.get(a).toString().compareTo(at.get(b).toString());
          
        } catch (Exception e) {
          throw new RuntimeException(e);
        }
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

    System.out.println("\nOdenado pelo compareTo");

    Collections.sort(ls);
    for (Carro c: ls)
      System.out.println(c);

    System.out.println("\nOrdenado pelo ComparatorId");

    Collections.sort(ls, Carro.getComparatorId());
    for (Carro c: ls)
      System.out.println(c);

    System.out.println("\nOrdenado pelo ComparatorNome");
    
    Collections.sort(ls, Carro.getComparatorNome());
    for (Carro c: ls)
      System.out.println(c);

    System.out.println("\nOrdenado pelo ComparatorValor");
    
    Collections.sort(ls, Carro.getComparatorValor());
    for (Carro c: ls)
      System.out.println(c);

    System.out.println("\nOrdenado pelo Comparator com reflexão");
    
    Collections.sort(ls, Carro.getComparator("valor"));
    for (Carro c: ls)
      System.out.println(c);

    System.out.println("\nForEach");
    ls.forEach((c) -> System.out.println(c));
    Object[] l2 =  ls.stream().map((c) -> c.id * 2).toArray();
    Object[] l3 =  ls.stream().filter((c) -> c.nome.startsWith("A")).toArray();
    

    System.out.println();

    if (new Carro(1,"a",0).equals(new Carro(1,"a",0)))
      System.out.println("Os dois carros são iguais.");
    
  }

}
