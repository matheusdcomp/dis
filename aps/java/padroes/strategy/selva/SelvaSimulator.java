package strategy.selva;

public class SelvaSimulator {

  public static void main(String[] args) {

    Leopardo leopardo = new Leopardo();

    leopardo.avistarAnimal(new Gazela());
    System.out.println();
    leopardo.avistarAnimal(new Bisao());
    System.out.println();
    leopardo.avistarAnimal(new Leao());
  }

}
