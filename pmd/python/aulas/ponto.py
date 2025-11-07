import math

class Ponto:
  
  def __init__(self, x, y):
    super().__init__()
    self.x = x
    self.y = y
  
  def __str__(self):
    return "(%.1f,%.1f)" % (self.x, self.y)
  
  def distancia(self, ponto):
    return math.sqrt(math.pow(self.x - ponto.x, 2) + math.pow(self.y - ponto.y, 2))
  
  def __lt__(self, ponto):
    if (ponto == None): 
      return False
    if isinstance(ponto, Ponto):
      zero = Ponto(0,0)
      return self.distancia(zero) < ponto.distancia(zero)
    return False  
  
  def __gt__(self, ponto):
    if (ponto == None): 
      return False
    if isinstance(ponto, Ponto):
      zero = Ponto(0,0)
      return self.distancia(zero) > ponto.distancia(zero)
    return False  
   
  def __eq__(self, ponto):
    if (ponto == None): 
      return False
    if isinstance(ponto, Ponto):
      return self.x == ponto.x and self.y == ponto.y 
    return False  
  
  def __le__(self, ponto):
    return self < ponto or self == ponto 
    
  def __ge__(self, ponto):
    return self > ponto or self == ponto

  def __ne__(self, ponto):
    return not(self == ponto)  


a = Ponto(1,1)
b = Ponto(3,-3)
c = Ponto(0,0)
d = Ponto(3,-3)


if a < b: print(f"{a} < {b}")
if b >= a: print(f"{b} >= {a}")
if a == d: print(f"{a} == {d}")
if a != c: print(f"{a} != {c}")
print(f"Distancia de {a} para {c}: {a.distancia(c)}")
