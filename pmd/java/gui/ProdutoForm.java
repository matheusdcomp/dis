package gui;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ProdutoForm extends JFrame implements ActionListener {

  private JTextField tfnm, tfvl;
  private JComboBox<String> cbct;
  private JButton btsv, btal, btrm, btcn;
  private DefaultTableModel modeloTabela;
  private JTable tabela;

  private String[] categorias = new String[] { "DIVERSOS", "LIMPEZA", "MANUTENÇÃO" };

  public ProdutoForm() {

    super("Formulário de produtos");
    setSize(800, 600);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new GridBagLayout());
    var fonte = new Font("ARIAL", Font.BOLD, 20);
    var gbc = new GridBagConstraints();
    gbc.fill = GridBagConstraints.HORIZONTAL;

    // linha 0
    var lbnm = new JLabel("Nome:");
    lbnm.setFont(fonte);
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.weightx = 0.0;
    gbc.weighty = 0;
    gbc.gridwidth = 1;
    add(lbnm, gbc);

    tfnm = new JTextField();
    tfnm.setFont(fonte);
    gbc.gridx = 1;
    gbc.gridy = 0;
    gbc.weightx = 0.0;
    gbc.weighty = 0;
    gbc.gridwidth = 7;
    add(tfnm, gbc);

    // linha 1
    var lbvl = new JLabel("Valor:");
    lbvl.setFont(fonte);
    gbc.gridx = 0;
    gbc.gridy = 1;
    gbc.weightx = 0.0;
    gbc.weighty = 0;
    gbc.gridwidth = 1;
    add(lbvl, gbc);

    tfvl = new JTextField();
    tfvl.setFont(fonte);
    gbc.gridx = 1;
    gbc.gridy = 1;
    gbc.weightx = 0.0;
    gbc.weighty = 0;
    gbc.gridwidth = 3;
    add(tfvl, gbc);

    var lbct = new JLabel("Categoria:");
    lbct.setFont(fonte);
    gbc.gridx = 4;
    gbc.gridy = 1;
    gbc.weightx = 0.0;
    gbc.weighty = 0;
    gbc.gridwidth = 1;
    add(lbct, gbc);

    cbct = new JComboBox<String>(categorias);
    cbct.setFont(fonte);
    cbct.setSelectedIndex(0);
    gbc.gridx = 5;
    gbc.gridy = 1;
    gbc.weightx = 0.0;
    gbc.weighty = 0;
    gbc.gridwidth = 3;
    add(cbct, gbc);

    // linha 2
    btsv = new JButton("Salvar");
    btsv.setFont(fonte);
    btsv.addActionListener(this);
    gbc.gridx = 0;
    gbc.gridy = 2;
    gbc.weightx = 0.5;
    gbc.weighty = 0;
    gbc.gridwidth = 2;
    add(btsv, gbc);

    btal = new JButton("Alterar");
    btal.setFont(fonte);
    btal.addActionListener(this);
    gbc.gridx = 2;
    gbc.gridy = 2;
    gbc.weightx = 0.5;
    gbc.weighty = 0;
    gbc.gridwidth = 2;
    add(btal, gbc);

    btrm = new JButton("Apagar");
    btrm.setFont(fonte);
    btrm.addActionListener(this);
    gbc.gridx = 4;
    gbc.gridy = 2;
    gbc.weightx = 0.5;
    gbc.weighty = 0;
    gbc.gridwidth = 2;
    add(btrm, gbc);

    btcn = new JButton("Cancelar");
    btcn.setFont(fonte);
    btcn.addActionListener(this);
    gbc.gridx = 6;
    gbc.gridy = 2;
    gbc.weightx = 0.5;
    gbc.weighty = 0;
    gbc.gridwidth = 2;
    add(btcn, gbc);

    // linha 3
    modeloTabela = new DefaultTableModel();
    modeloTabela.addColumn("Nome");
    modeloTabela.addColumn("Valor");
    modeloTabela.addColumn("Categoria");

    tabela = new JTable(modeloTabela);
    tabela.setFont(fonte);
    tabela.getColumnModel().getColumn(0).setMaxWidth(500);
    tabela.getColumnModel().getColumn(1).setMaxWidth(100);
    tabela.getColumnModel().getColumn(2).setMaxWidth(200);

    var scroll = new JScrollPane();
    scroll.setViewportView(tabela);
    gbc.gridx = 0;
    gbc.gridy = 3;
    gbc.weightx = 0.0;
    gbc.weighty = 1;
    gbc.gridwidth = 8;
    gbc.fill = GridBagConstraints.BOTH;
    gbc.insets = new Insets(5, 0, 5, 0);
    add(scroll, gbc);
  }

  @Override
  public void actionPerformed(ActionEvent e) {

    if (e.getSource() == btsv) {
      modeloTabela.addRow(new Object[] {
          tfnm.getText(),
          tfvl.getText(),
          cbct.getSelectedItem()
      });

    } else if (e.getSource() == btal) {
      for (int i = 0; i < tabela.getRowCount(); i++)
        if (tabela.isRowSelected(i)) {
          modeloTabela.setValueAt(tfnm.getText(), i, 0);
          modeloTabela.setValueAt(tfvl.getText(), i, 1);
          modeloTabela.setValueAt(cbct.getSelectedItem(), i, 2);
          break;
        }

    } else if (e.getSource() == btrm) {
      for (int i = 0; i < tabela.getRowCount(); i++)
        if (tabela.isRowSelected(i))
          modeloTabela.removeRow(i);

    } else if (e.getSource() == btcn) {
      tfnm.setText("");
      tfvl.setText("");
      cbct.setSelectedIndex(0);
      tabela.clearSelection();
    }
  }

  public static void main(String[] args) {
    new ProdutoForm().setVisible(true);
  }

}
