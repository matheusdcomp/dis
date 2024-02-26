package mvc.ex;

public class Controller {

  private Modelo modelo;

  public Controller(Modelo modelo) {
    this.modelo = modelo;
  }

  public void clicar() {
    modelo.atualiza();
  }
}
