class Pessoa:  
  
  def __init__(self, nome): 
    self.nome = nome

  def string(self):
    return self.nome

class PFisica (Pessoa):

  def __init__(self, nome, cpf): 
    super().__init__(nome)
    self.cpf = cpf

  def string(self):
    return super().string() + ' - ' + self.cpf

class PJuridica (Pessoa):

  def __init__(self, nome, cnpj):
    super().__init__(nome)
    self.cnpj = cnpj

  def string(self):
    return super().string() + ' - ' + self.cnpj


pessoas = []
pessoas.append( PFisica('JOAO','12345678910') )
pessoas.append( PJuridica('UFSJ','0001676742364') )

for p in pessoas:
  print (p.string()) 
