package factorym.editor;

public class ArquivoPDF implements Arquivo {

  @Override
  public void abrir(String nome) {
    System.out.println("Abrindo arquivo PDF " + nome);
  }

}
