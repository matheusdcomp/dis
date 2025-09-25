from abc import ABC, abstractmethod

class Pessoa (ABC):

  def __init__(self, nome=""):
    self.nome = nome

  def __str__(self):
    return f"Nome: {self.nome}"  
  
  @abstractmethod
  def getDocumento(self):pass

class PFisica (Pessoa):

  def __init__(self, nome="", cpf=""):
    super().__init__(nome)
    self.cpf = cpf

  def __str__(self):
    return  f"{super().__str__()} CPF: {self.cpf}"  
  
  def getDocumento(self):
    return self.cpf

p = PFisica("JOAO", "12345678910")
print(p)