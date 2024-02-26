package classes;

public class TesteSwitch {
  public static void main(String args) {
    switch ("abc") {
      case "cba": System.out.println("achou cba"); break;
      case "abc": System.out.println("achou abc"); break;
      default:    System.out.println("achou nada");
    }
  }  
}
