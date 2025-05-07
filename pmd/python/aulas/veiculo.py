from abc import ABC, abstractmethod

class Veiculo (ABS):

  def __init__(self,num):
    super().__init__()
    self.num = num
    
  def __str__():
    return "VEICULO"


class Moto (Veiculo):

  def __init__(self, num)
    super.__init__(num)

  def __str__():
    return "MOTO: " + self.num


class Carro (Veiculo):

  def __init__(self, num)
    super.__init__(num)

  def __str__():
    return "CARRO: " + self.num


#MAIN
veiculos = []
veiculos.append( Carro(1) )
veiculos.append( Moto(1) )
veiculos.append( Moto(2) )
veiculos.append( Carro(2) )

carros = []
motos = []
ic, im = 0, 0

for i in range(4):
  if isinstance(veiculo[i], Carro):
    carros[ic] = veiculos[i]
    ic += 1
  else:
    motos[ic] = veiculos[i]
    im += 1

print("CARROS:")
for c in carros:
  print(c)

print("MOTOS:")
for c in carros:
  print(c)