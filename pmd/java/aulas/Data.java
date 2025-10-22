package aulas;

public class Data {

  private int dia;
  private int mes;
  private int ano;

  public Data( int d, int m, int a ) {
    dia = d;
    mes = m;
    ano = a;
  }

  public String formata(char c) {
    return String.format("%d%c%d%c%d", dia,c,mes,c,ano);
  }
  
}

/*
  class Data:

  def __init__(self,d,m,a):
    self.dia = d
    self.mes = m
    self.ano = a
  
  def formata(self, c):
    return f"{self.dia}{c}{self.mes}{c}{self.ano}
  
 * 
 */
