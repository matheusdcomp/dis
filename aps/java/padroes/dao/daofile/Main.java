package dao.daofile;

import dao.daofile.data.PessoaDAO;
import dao.daofile.model.Pessoa;

public class Main {

  public static void main(String[] args) {
    PessoaDAO dao = new PessoaDAO();
    dao.inserir(new Pessoa(1, "JOAO"));
  }

}
