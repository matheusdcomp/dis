package genericos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UsaPessoa {

  public static void main(String[] args) {

    Pessoa p1 = new Pessoa("MARIA", 28, 1.60f);
    Pessoa p2 = new Pessoa("ANTONIO", 35, 1.70f);
    Pessoa p3 = new Pessoa("JOSE", 20, 1.90f);

    int x = p1.compareTo(p3);
    if (x == 0) {
      System.out.println(p1.getNome() + " e " + p3.getNome() + " têm a mesma idade.");
    }
    else if (x > 0) {
      System.out.println(p1.getNome() + " é mais velho do que " + p3.getNome());
    }
    else if (x < 0) {
      System.out.println(p1.getNome() + " é mais novo do que " + p3.getNome());
    }


    ArrayList<Pessoa> pessoas = new ArrayList<>();
    pessoas.add(p1);
    pessoas.add(p2);
    pessoas.add(p3);


    //ordenar por idade - usa o compareTo da própria classe Pessoa
    Collections.sort(pessoas);
    for (Pessoa p : pessoas)
      System.out.println(p.getNome() + ": " + p.getIdade());
      
    System.out.println(); 

    //ordenar por nome
    Collections.sort(pessoas, new Comparator<Pessoa>() {
      public int compare(Pessoa a, Pessoa b) {
        return a.getNome().compareTo(b.getNome());
      }
    });
    for (Pessoa p : pessoas)
      System.out.println(p.getNome());

    System.out.println();

    //ordenar por altura
    Collections.sort(pessoas, new Comparator<Pessoa>() {
      public int compare(Pessoa a, Pessoa b) {
        float res = a.getAltura() - b.getAltura();
        if (res < 0) return -1;
        if (res > 0) return 1;
        return 0;
      }
    });
    for (Pessoa p : pessoas)
      System.out.println(p.getNome() + ": " + p.getAltura());  


    //Comparar todos hierarquicamente: idade, nome e altura
    Comparator<Pessoa> c = Comparator.comparing((Pessoa p) -> p.getIdade())
          .thenComparing((Pessoa p) -> p.getNome())
          .thenComparing((Pessoa p) -> p.getAltura());  
    
    Collections.sort(pessoas, c);
    for (Pessoa p : pessoas)
      System.out.println(p.getNome()); 


  }

}
