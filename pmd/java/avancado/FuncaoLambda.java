package avancado;

import java.util.ArrayList;

public class FuncaoLambda {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);

    numbers.forEach(n -> { // se mais de uma linha, precisa de chaves
      System.out.println(n);
    });

    Greeting g = () -> System.out.println("Hello from lambda"); // sem nenhum parâmetro ou com mais de um, presisa de
                                                                // parênteses
    g.sayHello();
  }
}

interface Greeting {
  void sayHello();
}
