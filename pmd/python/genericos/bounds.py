from typing import TypeVar, Generic, SupportsAbs
import conteudo as c

T = TypeVar('T', bound=SupportsAbs[c.Conteudo])

class Caixa(Generic[T]):
  def __init__(self, conteudo:T): 
    self.conteudo = conteudo
  def getConteudo(self) -> T: 
    return self.conteudo
  def setConteudo(self, conteudo:T): 
    self.conteudo = conteudo

c1 = Caixa[c.Garrafa](c.Garrafa("AGUA"))
gr:c.Garrafa = c1.getConteudo()
print(gr)

c2 = Caixa[c.Chocolate](c.Chocolate(50.0))
ch:c.Chocolate = c2.getConteudo()
print(ch)
