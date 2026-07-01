package genericos;

import java.util.ArrayList;

import classes.Pessoa;

public class Wildcard{

 
  public void funcao2 () {
    Caixa<B> c1 = new Caixa<B>(new B());
    Caixa<String> c2 = new Caixa<>("");
    Caixa<Pessoa> c3 = new Caixa<>(new Pessoa());
  
    Caixa<?> c4 = c1;//aceita c1, c2 ou c3
    
  }
  
}

class A {}
class B extends A {}
