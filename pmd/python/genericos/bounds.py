from typing import TypeVar, Generic, SupportsAbs
from conteudo import Conteudo, Garrafa, Chocolate

T = TypeVar('T', bound=SupportsAbs[Conteudo])

class Caixa(Generic[T]):
  def __init__(self, conteudo:T): 
    self.conteudo = conteudo
  def getConteudo(self) -> T: 
    return self.conteudo
  def setConteudo(self, conteudo:T): 
    self.conteudo = conteudo

c1 = Caixa[Garrafa](Garrafa("AGUA"))
gr:Garrafa = c1.getConteudo()
print(gr)

c2 = Caixa[Chocolate](Chocolate(50.0))
ch:Chocolate = c2.getConteudo()
print(ch)
