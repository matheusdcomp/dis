from abc import ABC, abstractmethod

class Totalizavel(ABC):
  @abstractmethod
  def total(self): pass


class Entidade(ABC):
  def __init__(self, id):
    self.id = id

  def __str__(self):
    return f"ID: {self.id}"

class Produto(Entidade):

  def __init__(self, id, nome, valor):
    super().__init__(id)
    self.nome = nome
    self.valor = valor

  def __str__(self):
    return f"{super().__str__()}\t{self.nome}\t= {self.valor}"


class Venda(Entidade,Totalizavel):
  def __init__(self, id):
    super().__init__(id)
    self.itens = []

  def total(self):
    s = 0.0
    for i in self.itens:
      s += i.total()
    return s 

  def __str__(self):
    s = super().__str__()
    for i in self.itens:
      s += f"\n  {i}"
    return s + f"\nTOTAL: {self.total()}"


class ItemVenda(Totalizavel):

  def __init__(self, produto, qtd=1):
    self.produto = produto
    self.qtd = qtd
    self.valor = self.produto.valor

  def total(self):
    return self.qtd * self.valor 

  def __str__(self):
    return f"{self.produto.nome}\t{self.qtd} x {self.valor} = {self.total()}"



p1 = Produto(1, "AGUA",2.0)
p2 = Produto(2, "CHOCOLATE",10.0)
p3 = Produto(3, "SABAO",4.0)

v = Venda(1)
v.itens = [
    ItemVenda(p1, 5),
    ItemVenda(p2, 8),
    ItemVenda(p3, 3)
  ]

print(v)