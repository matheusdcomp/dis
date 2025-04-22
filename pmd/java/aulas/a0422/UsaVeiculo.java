package aulas.a0422;

public class UsaVeiculo {
  public static void main(String[] args) {
    Veiculo[] veiculos = new Veiculo[4];
    veiculos[0] = new Carro();
    veiculos[1] = new Moto();
    veiculos[2] = new Moto();
    veiculos[3] = new Carro();

    Carro[] carros = new Carro[2];
    Moto[] motos = new Moto[2];

    int ic = 0, im = 0;

    for (int i = 0; i < veiculos.length; i++) {
      if (veiculos[i] instanceof Carro)
        carros[ic++] = (Carro) veiculos[i];
      else
        motos[im++] = (Moto) veiculos[i];
    }
    System.out.println("CARROS:");
    for (Carro c : carros)
      System.out.println(c);
    System.out.println("MOTOS:");
    for (Moto m : motos)
      System.out.println(m);

  }
}
