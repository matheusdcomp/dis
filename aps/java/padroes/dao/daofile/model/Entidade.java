package dao.daofile.model;

import java.io.Serializable;

public class Entidade implements Serializable {

  private int id;

  public Entidade() {
    this.id = 0;
  }

  public Entidade(int id) {
    this.id = id;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "id:" + this.id;
  }

  @Override
  public boolean equals(Object o) {

    if (o == this)
      return true;

    if (!(o instanceof Entidade))
      return false;

    return this.id == ((Entidade) o).id;
  }

}