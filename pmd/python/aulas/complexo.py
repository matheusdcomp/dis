class Complexo:

  def __init__(self, a=0, b=0):
    self.a = a
    self.b = b
  
  def soma(self, c):
    return Complexo(self.a + c.a, self.b + c.b)

  def produto(self, c):
    return Complexo(
      self.a * c.a - self.b * c.b,
      self.b * c.a + self.a * c.b)

  def conjugado(self):
    return Complexo(self.a, -self.b)
  

  def __str__(self):
    return f"({self.a} + {self.b}i)"


#main
z = Complexo(2, 3)
w = Complexo(4, 5)
print(f"{z} + {w} = {z.soma(w)}")