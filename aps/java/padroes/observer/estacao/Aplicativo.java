package observer.estacao;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

public class Aplicativo extends JFrame implements Observer {

  private static final long serialVersionUID = -393219536666432791L;
  private JLabel temp;
  private JLabel umid;
  private JLabel vent;

  public Aplicativo() {

    setLayout(new GridLayout(3, 1));

    Font fonte = new Font("ARIAL", Font.BOLD, 36);
    temp = new JLabel("0 ºC", SwingConstants.CENTER);
    temp.setFont(fonte);
    temp.setSize(new Dimension(40, 20));

    umid = new JLabel("0 %", SwingConstants.CENTER);
    umid.setFont(fonte);
    umid.setSize(new Dimension(40, 20));

    vent = new JLabel("0 km/h", SwingConstants.CENTER);
    vent.setFont(fonte);
    vent.setSize(new Dimension(40, 20));

    add(temp);
    add(umid);
    add(vent);

    setTitle("Aplicativo");
    setSize(250, 200);
    setResizable(false);
    setVisible(true);
  }

  @Override
  public void update(Object o) {
    Estacao e = (Estacao) o;
    temp.setText(e.getTemperatura() + " �C");
    umid.setText(e.getUmidade() + " %");
    vent.setText(e.getVento() + " km/h");
  }

}
