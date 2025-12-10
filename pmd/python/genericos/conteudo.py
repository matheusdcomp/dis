class Conteudo: pass

class Garrafa (Conteudo):
  def __init__(self, rotulo:str):
    self.rotulo = rotulo
  def __str__(self):
    return f"GARRAFA: {self.rotulo}"


class Chocolate (Conteudo):
  def __init__(self, porcentagem:float):
    self.porcentagem = porcentagem
  def __str__(self):
    return f"CHOCOLATE {self.porcentagem}%" 