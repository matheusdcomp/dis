package aulas;

public class UsaData {
  
  private static Data[] datas;

  public static void main(String[] args) {
    datas = new Data[4];
    datas[0] = new Data(10,10,2025);
    datas[1] = new Data(11,9,2023);
    datas[2] = new DataHora(8,5,2025,10,15,25);
    datas[3] = new DataHora(10,10,2025,15,45,30);

    for (int i = 0; i < 4; i++)
      System.out.println(datas[i].formata('-'));

  }
}

/*
class UsaData:
  
  datas = []

  def main(self):
    datas = [
      Data(10,10,2025),
      Data(11,9,2023),
      DataHora(8,5,2025,10,15,25),
      DataHora(10,10,2025,15,45,30)
    ]

    for d in datas:
      print(d.formata('-'))

 */
