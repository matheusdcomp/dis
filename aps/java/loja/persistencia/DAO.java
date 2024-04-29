package aps.java.loja.persistencia;

import java.util.ArrayList;

import aps.java.loja.modelo.Entidade;

public interface DAO<E extends Entidade> {

  public ArrayList<E> getDados();

  public boolean inserir(E e);

}
