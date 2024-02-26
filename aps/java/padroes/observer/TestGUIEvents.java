package observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestGUIEvents extends JFrame {

  private static final long serialVersionUID = -1564084631441227878L;
  int clickCount;

  public TestGUIEvents() {
    clickCount = 0;
    setSize(300, 100);
    setTitle("Click-Count: " + clickCount);
    JButton button = new JButton("Click me!");
    button.addActionListener(new ButtonListener());
    add(button);
  }

  public static void main(String[] args) {
    new TestGUIEvents().setVisible(true);
  }

  protected class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent arg0) {
      clickCount++;
      setTitle("Click-Count: " + clickCount);
    }
  }
}