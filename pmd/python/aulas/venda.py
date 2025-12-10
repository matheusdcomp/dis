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

class ValorInvalidoException (Exception):
  def __init__(self, valor):
    super().__init__(f"Valor inválido para produto: {valor}")


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



produtos = []
while True:
  print("\n\n0 SAIR\n1 CRIAR PRODUTO\n2 IMPRIMIR")
  op = input("Digite sua opção: ")
  
  if op == "0": 
    break
  elif op == "1":
    id = int(input("ID do produto: "))
    nome = input("Nome do produto: ")
    valor = -1.0
    while valor <= 0:
      try:
        valor = float(input("Valor do produto: "))
        if valor <= 0: raise ValorInvalidoException(valor)
      except ValorInvalidoException as e:
        print(e)
    produtos.append(Produto(id, nome, valor))
  else:
    for p in produtos:
      print(p)  