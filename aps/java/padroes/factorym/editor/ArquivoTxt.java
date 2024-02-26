package factorym.editor;

public class ArquivoTxt implements Arquivo {

  @Override
  public void abrir(String nome) {
    System.out.println("Abrindo arquivo TXT " + nome);
  }

}
