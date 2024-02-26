package listas.listaex05;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class JCadastraPessoa extends JFrame {

  private static final long serialVersionUID = 7761013722054063276L;
  private JTextField tfNome, tfCidade;
  private JComboBox<String> cbEstado;
  private JRadioButton rbMasc, rbFemi;
  private JButton btInserir, btApagar;
  private JTable tabela;
  private DefaultTableModel modeloTabela;

  private ArrayList<Pessoa> pessoas;

  public JCadastraPessoa() {

    pessoas = new ArrayList<Pessoa>();

    setTitle("Cadastra Pessoas");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    setSize(new Dimension(500, 560));
    setResizable(false);

    tfNome = new JTextField();
    tfNome.setPreferredSize(new Dimension(420, 20));
    add(new JLabel("Nome:"));
    add(tfNome);

    tfCidade = new JTextField();
    tfCidade.setPreferredSize(new Dimension(220, 20));
    add(new JLabel("Cidade:"));
    add(tfCidade);

    String[] estados = { "AC", "AL", "AM", "AP", "BA", "CE", "DF",
        "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PE", "PI", "PR",
        "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" };
    cbEstado = new JComboBox<String>(estados);
    cbEstado.setPreferredSize(new Dimension(50, 20));
    add(new JLabel("UF:"));
    add(cbEstado);

    ButtonGroup bgSexo = new ButtonGroup();
    rbMasc = new JRadioButton("M");
    rbFemi = new JRadioButton("F");
    rbMasc.setSelected(true);
    bgSexo.add(rbMasc);
    bgSexo.add(rbFemi);
    add(new JLabel("Sexo:"));
    add(rbMasc);
    add(rbFemi);

    modeloTabela = new DefaultTableModel();
    modeloTabela.addColumn("Nome");
    modeloTabela.addColumn("Cidade");
    modeloTabela.addColumn("UF");
    modeloTabela.addColumn("Sexo");
    tabela = new JTable(modeloTabela);
    tabela.setPreferredSize(new Dimension(580, 400));
    tabela.getColumnModel().getColumn(0).setMaxWidth(200);
    tabela.getColumnModel().getColumn(1).setMaxWidth(200);
    tabela.getColumnModel().getColumn(2).setMaxWidth(30);
    tabela.getColumnModel().getColumn(3).setMaxWidth(40);

    JScrollPane scroll = new JScrollPane();
    scroll.setViewportView(tabela);
    add(scroll);

    btInserir = new JButton("Inserir");
    btInserir.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        adicionaPessoa();
        carregarTabela();
      }
    });
    add(btInserir);

    btApagar = new JButton("Apagar");
    btApagar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        removePessoa();
        carregarTabela();
      }
    });
    add(btApagar);
  }

  private void adicionaPessoa() {
    Pessoa p = new Pessoa(
        tfNome.getText(),
        tfCidade.getText(),
        cbEstado.getSelectedItem().toString(),
        rbMasc.isSelected() ? 'M' : 'F');
    pessoas.add(p);
  }

  private void removePessoa() {
    if (tabela.getSelectedRow() >= 0)
      pessoas.remove(tabela.getSelectedRow());
  }

  private void carregarTabela() {
    modeloTabela.setNumRows(0);
    for (Pessoa p : pessoas)
      modeloTabela.addRow(new Object[] {
          p.getNome(),
          p.getCidade(),
          p.getEstado(),
          p.getSexo()
      });
  }

  public static void main(String[] args) {
    new JCadastraPessoa().setVisible(true);
  }

}
