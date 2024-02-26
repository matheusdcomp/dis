package listas.listaex05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {

  private Path path;
  private String conteudo;
  private boolean salvo;

  public Arquivo() {
    path = null;
    conteudo = "";
    salvo = false;
  }

  public Arquivo(String path, String conteudo) {
    this.path = Paths.get(path);
    this.conteudo = conteudo;
    salvo = false;
  }

  public void abrir() {
    try {
      FileInputStream fis = new FileInputStream(path.toString());
      byte[] conteudo = new byte[fis.available()];
      fis.read(conteudo);
      fis.close();
      this.conteudo = new String(conteudo);
      salvo = true;
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void salvar() {
    try {
      if (!Files.exists(path))
        Files.createFile(path);
      FileOutputStream fos = new FileOutputStream(path.toString());
      fos.write(conteudo.getBytes());
      fos.close();
      salvo = true;
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public String getPath() {
    return path.toString();
  }

  public void setPath(String path) {
    this.path = Paths.get(path);
  }

  public String getConteudo() {
    return conteudo;
  }

  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
    this.salvo = true;
  }

  public boolean isSalvo() {
    return salvo;
  }

  public void setSalvo(boolean salvo) {
    this.salvo = salvo;
  }

}
