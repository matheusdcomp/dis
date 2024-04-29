package aps.java.loja;

import aps.java.loja.controle.ProdutoCtrl;
import aps.java.loja.persistencia.ProdutoDAO;
import aps.java.loja.visao.JProduto;

public class Main {

  public static void main(String[] args) {

    ProdutoDAO dao = new ProdutoDAO();
    ProdutoCtrl controlador = new ProdutoCtrl(dao);
    JProduto janela = new JProduto(controlador);
    janela.setVisible(true);
  }

}
