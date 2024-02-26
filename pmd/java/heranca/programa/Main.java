package heranca.programa;

import heranca.*;
//import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

    List<Identificavel> lista = new ArrayList<>();
    lista.add(new PessoaFisica("MARIA", "111"));
    lista.add(new PessoaJuridica("UFSJ", "764627"));
    lista.add(new PessoaFisica("JOSE", "222"));

    for (Identificavel i : lista) {
      System.out.println(i.getId());
      if (i instanceof PessoaFisica) {
        PessoaFisica pf = (PessoaFisica) i;
        pf.getCPF();
      } else {
        ((PessoaJuridica) i).getCnpj();
      }
    }

    Pessoa p = new PessoaFisica();
    p.getNome();
  }

}
