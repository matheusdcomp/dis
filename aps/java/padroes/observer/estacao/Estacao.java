package observer.estacao;

public class Estacao extends Subject {

  private float temperatura;
  private float umidade;
  private float vento;

  private static final Estacao INSTANCE = new Estacao();

  private Estacao() {
    this.temperatura = 0;
    this.umidade = 0;
    this.vento = 0;
  }

  public static Estacao getInstance() {
    return INSTANCE;
  }

  public float getTemperatura() {
    return temperatura;
  }

  public void setTemperatura(float temperatura) {
    this.temperatura = temperatura;
    notifyObservers();
  }

  public float getUmidade() {
    return umidade;
  }

  public void setUmidade(float umidade) {
    this.umidade = umidade;
    notifyObservers();
  }

  public float getVento() {
    return vento;
  }

  public void setVento(float vento) {
    this.vento = vento;
    notifyObservers();
  }

}
