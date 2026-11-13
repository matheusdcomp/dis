from typing import TypeVar, Generic
from conteudo import Garrafa, Chocolate

T = TypeVar('T')

class Caixa(Generic[T]):
  def __init__(self, conteudo:T): 
    self.conteudo = conteudo
  def getConteudo(self) -> T: 
    return self.conteudo
  def setConteudo(self, conteudo:T): 
    self.conteudo = conteudo

c1 = Caixa[str]("AGUA")
ct1:str = c1.getConteudo()
print(ct1)

c2 = Caixa[float](50.0)
ct2:float = c2.getConteudo()
print(ct2)

c3 = Caixa[Garrafa](Garrafa("ÁGUA"))
ct3:Garrafa = c3.getConteudo()
print(ct3)

c4 = Caixa[Chocolate](Chocolate(40))
ct4:Chocolate = c4.getConteudo()
print(ct4)
