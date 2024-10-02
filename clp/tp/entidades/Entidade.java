package clp.tp.entidades;

public abstract class Entidade {

  private long id;

  public Entidade() {
    super();
    id = System.currentTimeMillis();
  }

  public long getId() {
    return id;
  }

  public String toString() {
    return String.format("Id: %d\t", id);
  };

}