package aps.java.loja.controle;

import aps.java.loja.modelo.Produto;
import aps.java.loja.persistencia.ProdutoDAO;

import java.util.ArrayList;

public class ProdutoCtrl {

  private ProdutoDAO dao;

  public ProdutoCtrl(ProdutoDAO dao) {
    super();
    this.dao = dao;
  }

  public boolean inserir(Produto p) {
    return this.dao.inserir(p);
  }

  public ArrayList<Produto> carregarTodos() {
    return this.dao.getDados();
  }

}
