package gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class EventoTeclado extends JFrame implements KeyListener {

    JTextField textField;

    public EventoTeclado() {
        setTitle("KeyListener Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField();
        textField.addKeyListener(this); // Register the KeyListener
        add(textField);

        setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed: " + e.getKeyChar() + " (KeyCode: " + e.getKeyCode() + ")");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released: " + e.getKeyChar() + " (KeyCode: " + e.getKeyCode() + ")");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Key Typed: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new EventoTeclado();
    }
}