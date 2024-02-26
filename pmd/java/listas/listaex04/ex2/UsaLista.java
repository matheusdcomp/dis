package listas.listaex04.ex2;

import lista2.ex05.Produto;

public class UsaLista {

  public static void main(String[] args) {

    System.out.println("LISTA DE INTEIROS\n");
    Lista<Integer> lint = new Lista<>();
    lint.add(0, 1);
    lint.add(1, 2);
    lint.add(2, 4);
    lint.add(2, 3);
    System.out.println(lint.toString());
    System.out.println("Index do 4: " + lint.indexOf(4));
    lint.remove(1);
    System.out.println(lint.toString());

    System.out.println("\n\nLISTA DE STRINGS\n");
    Lista<String> lstr = new Lista<>();
    lstr.add(0, "A");
    lstr.add(1, "B");
    lstr.add(2, "D");
    lstr.add(2, "C");
    System.out.println(lstr.toString());
    System.out.println("Index do C: " + lstr.indexOf("C"));
    lstr.remove(1);
    System.out.println(lstr.toString());

    System.out.println("\n\nLISTA DE C�RCULOS\n");
    Lista<Produto<Integer>> lpro = new Lista<>();
    Produto<Integer> p = new Produto<Integer>(1, "CHOCOLATE", 3.99f);
    lpro.add(0, p);
    lpro.add(1, new Produto<Integer>(2, "AGUA", 1.99f));
    lpro.add(2, new Produto<Integer>(3, "CERVEJA", 4.99f));
    lpro.add(0, new Produto<Integer>(4, "LEITE", 3.39f));
    System.out.println(lpro.toString());
    System.out.println("Index do " + p + ": " + lpro.indexOf(p));
    lpro.remove(1);
    System.out.println(lpro.toString());

  }

}
