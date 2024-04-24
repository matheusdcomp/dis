package aps.java.loja.persistencia;

import aps.java.loja.modelo.Produto;

import java.util.ArrayList;

public class ProdutoDAO {

  private ArrayList<Produto> dados = new ArrayList<>();

  public ProdutoDAO() {
    super();
  }

  public ArrayList<Produto> getDados() {
    return dados;
  }

  public boolean inserir(Produto p) {
    return dados.add(p);
  }

  public Produto remover(int id) {
    for (int i = 0; i < dados.size(); i++) {
      if (dados.get(i).getId() == id)
        return dados.remove(i);
    }
    return null;
  }

}
