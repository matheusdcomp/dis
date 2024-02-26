package observer.estacao;

import java.util.List;
import java.util.ArrayList;

public abstract class Subject {

  protected List<Observer> observers = new ArrayList<>();

  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  public void remObserver(Observer observer) {
    observers.remove(observer);
  }

  public void notifyObservers() {
    for (Observer o : observers)
      o.update(this);
  }

}
