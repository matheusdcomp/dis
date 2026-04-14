package aulas;

public class Filha extends Mae {

  public void hello() {
    hello();
    System.out.println("Hello Filha");
  }
  
  public static void main(String[] args) {
    new Mae().hello();
    new Filha().hello();
  }

}
