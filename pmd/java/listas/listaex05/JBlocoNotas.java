package listas.listaex05;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class JBlocoNotas extends JFrame {

  private static final long serialVersionUID = -6336097206892502266L;

  private JMenuBar menubar;
  private JMenu mnArquivo;
  private JMenu mnSobre;
  private JMenuItem miNovo;
  private JMenuItem miAbrir;
  private JMenuItem miSalvar;
  private JMenuItem miSalvarComo;
  private JMenuItem miFechar;
  private JMenuItem miCreditos;
  private JTextArea textarea;

  private Arquivo arquivo;

  public JBlocoNotas() {

    super("Sem título");
    setSize(600, 450);
    // setLayout(new BorderLayout());

    arquivo = new Arquivo();

    textarea = new JTextArea();
    add(textarea, BorderLayout.CENTER);

    miNovo = new JMenuItem("Novo");
    miNovo.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        novoArquivo();
      }
    });

    miAbrir = new JMenuItem("Abrir");
    miAbrir.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        abrirArquivo();
      }
    });

    miSalvar = new JMenuItem("Salvar");
    miSalvar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        salvarArquivo();
      }
    });

    miSalvarComo = new JMenuItem("Salvar Como");
    miSalvarComo.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        salvarArquivo();
      }
    });

    miFechar = new JMenuItem("Fechar");
    miFechar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        fecharJanela();
      }
    });

    miCreditos = new JMenuItem("Créditos");
    miCreditos.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(
            textarea.getParent(), "Autor: Matheus Viana", "Créditos",
            JOptionPane.INFORMATION_MESSAGE);
      }
    });

    mnArquivo = new JMenu("Arquivo");
    mnArquivo.add(miNovo);
    mnArquivo.add(miAbrir);
    mnArquivo.add(miSalvar);
    mnArquivo.add(miSalvarComo);
    mnArquivo.add(miFechar);

    mnSobre = new JMenu("Sobre");
    mnSobre.add(miCreditos);

    menubar = new JMenuBar();
    menubar.add(mnArquivo);
    menubar.add(mnSobre);
    setJMenuBar(menubar);

    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent windowEvent) {
        fecharJanela();
      }
    });

  }

  private int arquivoModificado() {
    if (arquivo.getConteudo().equals(textarea.getText()))
      return JOptionPane.NO_OPTION;

    return JOptionPane.showConfirmDialog(
        this,
        "O arquivo foi modificado. Deseja salvá-lo?",
        "Alerta",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE);
  }

  private void novoArquivo() {

    int salvar = arquivoModificado();

    if (salvar == JOptionPane.YES_OPTION) {
      salvarArquivo();
    }

    if (salvar != JOptionPane.CANCEL_OPTION) {
      arquivo = new Arquivo();
      textarea.setText("");
      setTitle("Sem título");
    }
  }

  private void abrirArquivo() {

    int salvar = arquivoModificado();

    if (salvar == JOptionPane.YES_OPTION) {
      salvarArquivo();
    }

    if (salvar != JOptionPane.CANCEL_OPTION) {
      JFileChooser fc = new JFileChooser();
      fc.setDialogTitle("Selecione um arquivo de texto.");
      fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
      if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
        arquivo.setPath(fc.getSelectedFile().toString());
        arquivo.abrir();
        textarea.setText(arquivo.getConteudo());
        setTitle(arquivo.getPath());
      }
    }
  }

  private void salvarArquivo() {

    if (!arquivo.isSalvo()) {
      JFileChooser fc = new JFileChooser();
      fc.setDialogTitle("Salvar arquivo.");
      fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
      if (fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION)
        arquivo.setPath(fc.getSelectedFile().toString());
    }
    arquivo.setConteudo(textarea.getText());
    arquivo.salvar();
    setTitle(arquivo.getPath());
  }

  public void fecharJanela() {
    int res = arquivoModificado();
    if (res == JOptionPane.YES_OPTION) {
      salvarArquivo();
      dispose();
    } else if (res == JOptionPane.NO_OPTION) {
      dispose();
    }
  }

  public static void main(String[] args) {
    new JBlocoNotas().setVisible(true);
  }

}
