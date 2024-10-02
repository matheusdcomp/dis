package clp.tp.data;

import java.util.ArrayList;
import java.util.List;

import clp.tp.entidades.Entidade;

public class DAO<E extends Entidade> {

  private List<E> dados;

  public DAO() {
    super();
    dados = new ArrayList<>();
  }

  public List<E> getDados() {
    return dados;
  }

  public void adicionar(E entidade) {
    dados.add(entidade);
  }

  public E buscar(long id) {

    for (E p : dados)
      if (p.getId() == id)
        return p;

    return null;
  }

  public void remover(long id) {
    dados.removeIf((e) -> e.getId() == id); // filtro com função lambda
  }

  @Override
  public String toString() {

    var sb = new StringBuilder();

    for (E e : dados) {
      sb.append("\n" + e.toString());
    }

    return sb.toString();
  }

}
