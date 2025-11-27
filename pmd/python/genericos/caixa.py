from typing import TypeVar, Generic

T = TypeVar('T')

class Caixa(Generic[T]):
  def __init__(self, conteudo:T): 
    self.conteudo = conteudo
  def getConteudo(self) -> T: 
    return self.conteudo
  def setConteudo(self, conteudo:T): 
    self.conteudo = conteudo

c1 = Caixa[str]("AGUA")
ct = c1.getConteudo()
print(ct)

c2 = Caixa[float](50.0)
ct = c2.getConteudo()
print(ct)
