package clp.tp.entidades;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Venda extends Entidade implements Totalizavel {

  private LocalDateTime dataHora;
  private List<ItemVenda> itens;

  public Venda() {
    super();
    dataHora = LocalDateTime.now();
    itens = new ArrayList<>();
  }

  public LocalDateTime getDataHora() {
    return dataHora;
  }

  public List<ItemVenda> getItens() {
    return itens;
  }

  public void adicionarItem(Produto produto, int qtd) {
    itens.add(new ItemVenda(produto, qtd));
  }

  public void removerItem(int posicao) {
    itens.remove(posicao);
  }

  public void removerItem(String nomeProduto) {
    itens.removeIf((i) -> i.getProduto().getNome().equalsIgnoreCase(nomeProduto)); // filtro com função lambda
  }

  public String toString() {

    var sb = new StringBuilder(String.format("%sData-Hora: %s\nItens:\n", super.toString(), dataHora));

    for (ItemVenda i : itens) {
      sb.append("\n  " + i.toString());
    }

    sb.append("\nTOTAL: " + total());

    return sb.toString();
  }

  @Override
  public double total() {

    var t = 0.0; // Quando se usa var, Java infere o tipo a aprtir do valor.

    for (ItemVenda i : itens) { // laço por estrutura de dados
      t += i.valor * i.qtd; // Em Java, a classe externa acessa os membros privados da classe interna. Java
                            // é fortemente tipada, mas aceita coerção por alargamento.
    }

    return t;
  }

  private class ItemVenda { // Classe interna

    private Produto produto;
    private int qtd;
    private double valor;

    public ItemVenda(Produto produto, int qtd) {
      super();
      this.produto = produto;
      this.qtd = qtd;
      this.valor = produto.getValor();
    }

    public Produto getProduto() {
      return produto;
    }

    public String toString() {
      return String.format("%15s %8.2f x %5d = %8.2f", produto.getNome(), valor, qtd, valor * qtd);
    };

  }

}
