package avancado;

public class TesteCompare<E extends Comparable<E>> {

  public int contaMaiores(E[] v, E e) {
    int count = 0;
    for (int i = 0; i < v.length; i++)
      if (v[i].compareTo(e) > 0)
        ++count;
    return count;
  }

  public static void main(String[] args) {
    Pessoa a = new Pessoa("JOAO", 40, 1.8f);
    Pessoa b = new Pessoa("JOSE", 25, 1.7f);
    Pessoa c = new Pessoa("MARIA", 30, 1.75f);
    if (a.compareTo(b) > 0) {
      System.out.println(a.getNome() + " eh mais velho que " + b.getNome());
    }

    TesteCompare<Pessoa> tcp = new TesteCompare<>();
    Pessoa[] lp = { a, b, c};
    Pessoa x = new Pessoa("ANA", 28, 1.78f);
    System.out.println("Quantas pessoas mais velhas que Ana: " + 
      tcp.contaMaiores(lp, x)
    );

    TesteCompare<String> tcs = new TesteCompare<>();
    String[] ls = {"ABC", "DFG", "HIJ"};
    String s = "ANA";
    System.out.println("Quantas strings vem depois de 'Ana': " + 
      tcs.contaMaiores(ls, s)
    );

  }

}
