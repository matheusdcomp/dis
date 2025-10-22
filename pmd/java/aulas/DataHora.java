package aulas;

public class DataHora extends Data {
  
  private int hora, min, seg;

  public DataHora(int dia, int mes, int ano, int hora, int min, int seg) {
    super(dia, mes, ano);
    this.hora = hora;
    this.min = min;
    this.seg = seg;
  }

  public String formata(char c) {
    return String.format("%s%d%c%d%c%d", super.formata(c), hora,c,min,c,seg);
  }

}
/*
class DataHora (Data):

  def __init__(self, dia, mes, ano, hora, min, seg):
    super().__init__(dia, mes, ano)
    self.hora = hora
    self.min = min
    self.seg = seg
  
  def formata(self, c):
    return f"{super().formata(c)}{self.dia}{c}{self.mes}{c}{self.ano}

} */