package clp.tp.data;

import clp.tp.entidades.Produto;

public class DAOProduto {

  private static final DAOProduto instance = new DAOProduto();
  private static DAO<Produto> dao = new DAO<>();

  private DAOProduto() {
    super();
  }

  public static DAOProduto getInstance() {
    return instance;
  }

  public void adicionar(Produto produto) {
    dao.adicionar(produto);
  }

  public Produto buscar(long id) {
    return dao.buscar(id);
  }

  public Produto buscar(String nome) {

    for (Produto p : dao.getDados())
      if (p.getNome().equals(nome))
        return p;

    return null;
  }

  public void remover(long id) {
    dao.remover(id);
  }

  public void remover(String nome) {
    dao.getDados().removeIf((e) -> e.getNome().equals(nome)); // filtro com função lambda
  }

  @Override
  public String toString() {
    return dao.toString();
  }

}
