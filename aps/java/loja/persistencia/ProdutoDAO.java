package aps.java.loja.persistencia;

import aps.java.loja.modelo.Produto;

import java.util.ArrayList;

public class ProdutoDAO implements DAO<Produto> {

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

}
