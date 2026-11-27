package aulas;

import java.io.Serializable;

public class Casa {

  private Pacote<? extends Serializable> pacote;
  
  public Casa() {
    this.pacote = null;
  }

  public Casa(Pacote<? extends Serializable> pacote) {
    this.pacote = pacote;
  }

  public Pacote<? extends Serializable> getPacote() {
    return pacote;
  }

  public void setPacote(Pacote<? extends Serializable> pacote) {
    this.pacote = pacote;
  }

  Pacote<? extends Serializable> entregar() throws CasaVaziaException{
    if (this.pacote == null)
      throw new CasaVaziaException();
    Pacote<? extends Serializable> p = this.pacote;
    this.pacote = null;
    return p;
  }

  void receber(Pacote<? extends Serializable> p) throws CasaCheiaException {
    if (this.pacote != null)
      throw new CasaCheiaException(this.pacote.toString());
    this.pacote = p;
  }

  @Override
  public String toString() {
    if (pacote == null)
      return "<VAZIA>";
    return pacote.toString();
  }
  
}
