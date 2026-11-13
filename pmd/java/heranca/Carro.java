package heranca;

import java.io.Serializable;

abstract class Veiculo {

  public void metodox(){}

  public abstract void metodoy();
  
}

public class Carro extends Veiculo implements Serializable, Implementavel, Totalizavel {
 
  public void metodoy() {}
   
}

