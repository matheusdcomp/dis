package genericos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UsaPessoa {

  public static void main(String[] args) {

    Pessoa p1 = new Pessoa("MARIA", 28);
    Pessoa p2 = new Pessoa("ANTONIO", 35);
    Pessoa p3 = new Pessoa("JOSE", 20);

    ArrayList<Pessoa> pessoas = new ArrayList<>();
    pessoas.add(p1);
    pessoas.add(p2);
    pessoas.add(p3);

    Collections.sort(pessoas, new Comparator<Pessoa>() {
      public int compare(Pessoa a, Pessoa b) {
        return a.getNome().compareTo(b.getNome());
      }
    });

    for (Pessoa x : pessoas)
      System.out.println(x.getNome());
  }

}
