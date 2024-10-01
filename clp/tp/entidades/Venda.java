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

  public void adicionarItem(Produto produto) {
    itens.add(new ItemVenda(produto));
  }

  public void removerItem(int posicao) {
    itens.remove(posicao);
  }

  public void removerItem(String nomeProduto) {
    itens.removeIf((i) -> i.getProduto().getNome().equalsIgnoreCase(nomeProduto)); // filtro com função lambda
  }

  private class ItemVenda implements Totalizavel { // classe interna/aninhada

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

    public int getQtd() {
      return qtd;
    }

    public double getValor() {
      return valor;
    }

    public String toString() {
      return String.format("%50s-%8.2lf-%5d-%8.2lf", produto.getNome(), valor, qtd, total());
    };

    public double total() {
      return valor * qtd;
    };

  }

}
