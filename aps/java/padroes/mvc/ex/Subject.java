package mvc.ex;

import java.util.List;
import java.util.ArrayList;

public abstract class Subject {

  List<Observer> observers = new ArrayList<Observer>();

  public void addObserver(Observer o) {
    observers.add(o);
  }

  public abstract void notifyObservers();

}