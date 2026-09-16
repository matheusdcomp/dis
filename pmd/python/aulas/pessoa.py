from abc import ABC, abstractmethod

class Pessoa(ABC):

  def __init__(self, nome):
    self.nome = nome

  @abstractmethod  
  def documento(self): pass  



class PessoaFisica(Pessoa):
  def __init__(self, nome, cpf):
    super().__init__(nome)
    self.cpf = cpf
  def documento(self): 
    return self.cpf 


class PessoaJuridica(Pessoa):
  def __init__(self, nome, cnpj):
    super().__init__(nome)
    self.cnpj = cnpj
  def documento(self): 
    return self.cnpj 

#p1 = Pessoa("JOAO")
p2 = PessoaFisica("MARIA", 12345678910)
p3 = PessoaJuridica("UFSJ",75238757943)

#print(p1.nome)
print(p2.nome, p2.documento())
print(p3.nome, p3.documento())
