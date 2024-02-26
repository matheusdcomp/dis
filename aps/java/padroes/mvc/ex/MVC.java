package mvc.ex;

public class MVC {
  public static void main(String args[]) {
    Modelo modelo = new Modelo();
    Controller controller = new Controller(modelo);
    Visao visao = new Visao(controller);
    modelo.addObserver(visao);
    visao.rodar();
  }
}
