class Classe:

  def __init__(self):
    self.atr1 = 1
      
  def addAtr2(self, x):
    self.atr2 = 2
    x = 1
    
  def addAtr2(self):
    self.atr2 = 2

  
a = Classe()
b = Classe()
c = Classe()

print(dir(a))
print(dir(b))

b.addAtr2(1)
c.addAtr2(2)
c.atr3 = 3 #aceita mas o dir nao identifica como atributo da classe

print(dir(a), "\n")
print(dir(b), "\n")
print(dir(b), "\n")

print("atr3 em c: ", c.atr3)