package listas.listaex02.ex1;

public class Main {

  public static void main(String[] args) {

    Funcionario fu = new Funcionario("JOAO", "joao@ufsj,edu br");
    Assistente as = new Assistente("MARIA", "maria@usfj.edu.br", 1);
    AssistenteAdministrativo aa = new AssistenteAdministrativo("JOSE", "jose@ufsj.edu.br", 1, 0, 300f);
    AssistenteTecnico at = new AssistenteTecnico("ANA", "anae@ufsj.edu.br", 1, 200f);

    fu.exibeDados();
    as.exibeDados();
    aa.exibeDados();
    at.exibeDados();
  }

}
