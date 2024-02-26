package adapter.cliente;

import java.util.ArrayList;
import java.util.List;

public class SomadorAdapter implements SomadorEsperado {

  private SomadorExistente somador;

  public SomadorAdapter() {
    somador = new SomadorExistente();
  }

  public int somaVetor(int[] vetor) {

    List<Integer> lista = new ArrayList<>(vetor.length);

    for (int n : vetor) {
      lista.add(n);
    }

    return somador.somaLista(lista);
  }

}
