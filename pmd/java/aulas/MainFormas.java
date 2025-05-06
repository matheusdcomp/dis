package aulas;

import java.util.*;

public class MainFormas {

  public static void main(String[] args) {

    new Ponto().imprimir();
    new Circulo(new Ponto(), 0).imprimir();

    List<Numeravel> lst = new LinkedList<>();
    lst.add(new Ponto(1, 2));
    lst.add(new Circulo(new Ponto(1, 2), 5));
    lst.add(new Ponto(10, 2));
    lst.add(new Circulo(new Ponto(5, 5), 2));

    for (Numeravel fg : lst)
      fg.numerar();

  }
}
