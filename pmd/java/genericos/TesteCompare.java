package genericos;

public class TesteCompare<E extends Comparable<E>> {

  public int contaMaiores(E[] v, E e) {
    int count = 0;
    for (int i = 0; i < v.length; i++)
      if (v[i].compareTo(e) > 0)
        ++count;
    return count;
  }

}
