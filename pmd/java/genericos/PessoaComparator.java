package genericos;

import java.util.Comparator;

public class PessoaComparator implements Comparator<Pessoa> {
  public int compare(Pessoa a, Pessoa b) {
    return a.getNome().compareTo(b.getNome());
  }
}