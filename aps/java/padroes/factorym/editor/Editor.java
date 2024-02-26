package factorym.editor;

public abstract class Editor {

  public abstract Arquivo createArquivo(String nome);

  public void abrirArquivo(String nome) {
    Arquivo arq = createArquivo(nome);
    arq.abrir(nome);
  }

}
