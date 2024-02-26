package classes;

import java.util.ArrayList;

public class Venda {

  private ArrayList<Produto> produtos;
  // private Cliente cliente;
  private int numero;

  public Venda() {
    produtos = new ArrayList<>();
    numero = 0;
  }

  public Venda(ArrayList<Produto> produtos, int numero) {
    this.produtos = produtos;
    this.numero = numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public void addProduto(Produto produto) {
    produtos.add(produto);
  }

  public void remProduto(int produto) {
    produtos.remove(produto);
  }

  public void remProduto(String nome) {
    for (Produto p : produtos) {
      if (p.getNome().equals(nome)) {
        produtos.remove(p);
        break;
      }
    }
  }

  public int getNumero() {
    return numero;
  }

  public ArrayList<Produto> getProdutos() {
    return produtos;
  }

  public void imprimir() {
    System.out.print("\nNumero: " + numero);
    for (Produto p : produtos)
      p.imprimir();
  }

}
