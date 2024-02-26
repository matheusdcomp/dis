package mvc.ex;

public class Modelo extends Subject {

  private int id = 0;

  public void atualiza() {
    id++;
    notifyObservers();
  }

  public void notifyObservers() {
    for (Observer o : observers)
      o.update(id);
  }

}