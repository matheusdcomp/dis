package factorym.editor;

public class RichEditor extends Editor {

  public Arquivo createArquivo(String nome) {
    Arquivo arq = null;
    if (nome.contains(".pdf"))
      arq = new ArquivoPDF();
    else if (nome.contains(".docx"))
      arq = new ArquivoDocx();
    return arq;
  }

  public static void main(String args[]) {
    Editor editor = new RichEditor();
    editor.abrirArquivo("padroes.docx");
  }

}
