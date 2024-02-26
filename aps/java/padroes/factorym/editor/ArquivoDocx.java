package factorym.editor;

public class ArquivoDocx implements Arquivo {

  @Override
  public void abrir(String nome) {
    System.out.println("Abrindo arquivo DOCX " + nome);
  }

}
