class Produto:

  def __init__(self, codigo = 0, nome = "", valor = 0.0):
    self.codigo = codigo
    self.nome = nome
    self.valor = valor
  
  def __str__(self):
    return "Produto { codigo = '%d', nome = '%s', valor = '%.2f'}" % \
      (self.codigo, self.nome, self.valor)

  def __lt__(self, other):
    r = self.nome < other.nome
    return  r if r else self.valor < other.valor

  def __le__(self, other):
    r = self.nome <= other.nome
    return  r if r else self.valor <= other.valor

  def __gt__(self, other):
    r = self.nome > other.nome
    return  r if r else self.valor > other.valor

  def __ge__(self, other):
    r = self.nome >= other.nome
    return  r if r else self.valor >= other.valor

  def __eq__(self, other):
    r = self.nome == other.nome
    return  r if r else self.valor == other.valor

  def __ne__(self, other):
    r = self.nome != other.nome
    return  r if r else self.valor != other.valor
