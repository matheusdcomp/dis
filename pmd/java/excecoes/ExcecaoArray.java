package excecoes;

public class ExcecaoArray {
  public static void main(String[] args) { 
    metodo1(); 
  }
  public static void metodo1() { 
    metodo2(); 
  }
  public static void metodo2() {
    int[] array = { 1, 2, 3, 4, 5 };
  //  try {

      for (int i = 0; i < 6; i++)
        System.out.println(array[i]); //a exceção ocorre quando i = 5

 //   } catch (ArrayIndexOutOfBoundsException e) {
  //    System.err.println("\nPAM: índice inválido.");
 //   }

    System.err.println("\nFim do método 2."); 
  }
}