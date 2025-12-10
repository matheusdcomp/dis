package aulas;

import java.util.ArrayList;
import java.util.List;

public class UsaWildcards {


  public static void imprimeCaixa(List<? extends Caixa<Conteudo>> caixas) {
    for (Caixa<Conteudo> c : caixas)
    System.out.println(c.getConteudo().volume());
  }

  public static void main(String[] args) {
    
    Caixa<Conteudo> cg = new Caixa<Conteudo>(new Garrafa(1, 2, 3, "AGUA"));
    Caixa<Conteudo> cb = new Caixa<Conteudo>(new BarraChocolate(1, 2, 3, 50));

    var lista1 = new ArrayList<Caixa<Conteudo>>();
    lista1.add(cg);    
    var lista2 = new ArrayList<Caixa<Conteudo>>();    
    lista2.add(cb);
    
    imprimeCaixa(lista1);
    imprimeCaixa(lista2);
    
  }
}
