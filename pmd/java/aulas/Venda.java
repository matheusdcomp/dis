package aulas;

import java.util.LinkedList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

public class Venda {

  private Integer id;
  private Calendar datahora;
  private List<Produto> produtos;

  public Venda() {
    this.id = new Random(System.currentTimeMillis()).nextInt();
    this.datahora = Calendar.getInstance();
    this.produtos = new LinkedList<>();
  }

  public Integer getId() {
    return id;
  }

  public Calendar getDatahora() {
    return datahora;
  }

  public List<Produto> getProdutos() {
    return produtos;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setDatahora(Calendar datahora) {
    this.datahora = datahora;
  }

  public void addProduto(Produto p) {
    produtos.add(p);
  }

  public void remProduto(Produto p) {
    produtos.remove(p);
  }

  public void remProduto(Integer id) {
    for (int i = 0; i < produtos.size(); i++) {
      if (produtos.get(i).getId() == id) {
        produtos.remove(i);
        break;
      }
    }
  }

  public String toString() {
    String s = "Id: " + id + "\tData/Hora: ";
    s += datahora.get(Calendar.DAY_OF_MONTH) + "/" +
      datahora.get(Calendar.MONTH) + "/" +
      datahora.get(Calendar.YEAR) + " " +
      datahora.get(Calendar.HOUR_OF_DAY) + ":" +
      datahora.get(Calendar.MINUTE); 
    for (Produto p : produtos) {
      s += "\n" + p;
    }
    return s;
  }

}
