class Animal:
  def __init__(self, peso=0):
    self.peso = peso
  def __str__(self):
    return "peso=%d" % (self.peso)

class Mamifero(Animal):
  def __init__(self, peso=0, idade=0):
    super().__init__(peso)
    self.idade = idade
  def __str__(self):
    return super().__str__() + (", idade=%d" % (self.idade))

class Leao(Mamifero):
  def __init__(self, peso=0, idade=0, juba=False):
    super().__init__(peso, idade)
    self.juba = juba
  def __str__(self):
    return super().__str__() + (", juba=%s" % ("sim" if self.juba else "nao"))


a = Animal(200)
print(a)
