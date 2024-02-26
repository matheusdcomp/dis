package listas.listaex03.ex04;

import javax.swing.JOptionPane;

public class TestaNotANumber {

  public static void main(String[] args) {
    try {
      String numero = JOptionPane.showInputDialog("Digite um numero real.");
      if (!numero.matches("\\d") && !numero.matches("\\d.\\d"))
        throw new ItsNotANumberException(numero);
      System.out.println(numero + " � um n�mero v�lido.");
    } catch (ItsNotANumberException e) {
      e.printStackTrace();
    }

  }

}
