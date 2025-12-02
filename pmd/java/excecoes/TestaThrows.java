package excecoes;

public class TestaThrows {

  public static void testa() throws ArithmeticException {
      int a = 5 / 0; //exceção
  }

  public static void main(String[] args) {
     try {
       testa();
     } 
    catch (ArithmeticException e) {
       System.out.println("\nPAM: divisão por zero");
     } 
  }
}
