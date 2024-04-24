package aps.java.loja.visao;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import aps.java.loja.controle.ProdutoCtrl;
import aps.java.loja.modelo.Produto;

public class JProduto extends JFrame {

  private JTextField tfId, tfNome, tfValor;
  private JButton btInserir;
  private JTable tabela;
  private DefaultTableModel modeloTabela;

  private ProdutoCtrl controler;

  public JProduto(ProdutoCtrl controler) {

    super("Produto");
    construirJanela();
    this.controler = controler;
  }

  private void construirJanela() {

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    setSize(new Dimension(600, 700));
    setResizable(false);

    tfId = new JTextField();
    tfId.setPreferredSize(new Dimension(450, 20));
    add(new JLabel("Id:"));
    add(tfId);

    tfNome = new JTextField();
    tfNome.setPreferredSize(new Dimension(450, 20));
    add(new JLabel("Nome:"));
    add(tfNome);

    tfValor = new JTextField();
    tfValor.setPreferredSize(new Dimension(450, 20));
    add(new JLabel("Valor:"));
    add(tfValor);

    modeloTabela = new DefaultTableModel();
    modeloTabela.addColumn("Id");
    modeloTabela.addColumn("Nome");
    modeloTabela.addColumn("Valor");
    tabela = new JTable(modeloTabela);
    tabela.setPreferredSize(new Dimension(510, 400));
    tabela.getColumnModel().getColumn(0).setMaxWidth(50);
    tabela.getColumnModel().getColumn(1).setMaxWidth(250);
    tabela.getColumnModel().getColumn(2).setMaxWidth(100);

    JScrollPane scroll = new JScrollPane();
    scroll.setViewportView(tabela);
    add(scroll);

    btInserir = new JButton("Inserir");
    btInserir.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        adicionar();
        carregarTabela();
      }
    });
    add(btInserir);

  }

  private void adicionar() {

    Produto p = new Produto(
        Integer.parseInt(tfId.getText()),
        tfNome.getText(),
        Float.parseFloat(tfValor.getText()));

    controler.inserir(p);
  }

  private void carregarTabela() {

    modeloTabela.setNumRows(0);

    for (Produto p : controler.carregarTodos())
      modeloTabela.addRow(new Object[] {
          p.getId(),
          p.getNome(),
          p.getValor()
      });
  }

}