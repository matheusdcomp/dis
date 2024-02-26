package observer.estacao;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JEstacao extends JFrame {

  private Estacao estacao;
  private JTextField tfTemp = new JTextField();
  private JTextField tfUmid = new JTextField();
  private JTextField tfVent = new JTextField();

  public JEstacao(Estacao estacao) {

    this.estacao = estacao;

    JPanel painel = new JPanel(new GridLayout(4, 2));

    tfTemp = new JTextField(10);
    tfUmid = new JTextField(10);
    tfVent = new JTextField(10);

    JButton btEnviar = new JButton();
    btEnviar.setText("Enviar dados");
    btEnviar.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        ajustaDados();
      }
    });

    painel.add(new JLabel("Temperatura:"));
    painel.add(tfTemp);
    painel.add(new JLabel("Umidade do ar:"));
    painel.add(tfUmid);
    painel.add(new JLabel("Velocidade do Vento:"));
    painel.add(tfVent);
    add(painel, BorderLayout.CENTER);
    add(btEnviar, BorderLayout.SOUTH);

    setSize(300, 150);
    setResizable(false);
    setTitle("Estação");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
  }

  public void ajustaDados() {
    estacao.setTemperatura(Float.parseFloat(tfTemp.getText()));
    estacao.setUmidade(Float.parseFloat(tfUmid.getText()));
    estacao.setVento(Float.parseFloat(tfVent.getText()));
  }

}
