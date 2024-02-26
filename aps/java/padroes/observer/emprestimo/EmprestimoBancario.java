package observer.emprestimo;

import java.util.ArrayList;

public class EmprestimoBancario implements Subject {

  private ArrayList<Observer> observers;
  private String banco;
  private String tipo;
  private float taxa;

  public EmprestimoBancario() {
    this.observers = new ArrayList<Observer>();
    this.banco = "";
    this.tipo = "";
    this.taxa = 0;
  }

  public EmprestimoBancario(String banco, String tipo, float taxa) {
    this.observers = new ArrayList<Observer>();
    this.banco = banco;
    this.tipo = tipo;
    this.taxa = taxa;
  }

  public String getBanco() {
    return banco;
  }

  public void setBanco(String banco) {
    this.banco = banco;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public float getTaxa() {
    return taxa;
  }

  public void setTaxa(float taxa) {
    this.taxa = taxa;
    notifyObservers();
  }

  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observers)
      observer.update(getTaxa());
  }

}
