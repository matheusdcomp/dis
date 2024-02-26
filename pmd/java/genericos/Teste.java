package genericos;

public class Teste<E extends Comparable<E>> {
  public int contaMaiores(E[] v, E e, int tam) {
    int count = 0;
    for (int i = 0; i < tam; i++)
      if (v[i].compareTo(e) > 0)
        ++count;
    return count;
  }
}
