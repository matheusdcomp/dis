package clp.tp.data;

import clp.tp.entidades.Venda;

public class DAOVenda {

  private static final DAOVenda instance = new DAOVenda();
  private static DAO<Venda> dao = new DAO<>();

  private DAOVenda() {
    super();
  }

  public static DAOVenda getInstance() {
    return instance;
  }

  public void adicionar(Venda Venda) {
    dao.adicionar(Venda);
  }

  public Venda buscar(long id) {
    return dao.buscar(id);
  }

  public void remover(long id) {
    dao.remover(id);
  }

  @Override
  public String toString() {
    return dao.toString();
  }

}
