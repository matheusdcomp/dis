class Circulo:

  def __init__(self, raio=0):
    self.raio = raio

  def area(self):
    return 3.1415 * self.raio * self.raio
  

r = 4.0
c1 = Circulo(4.0)
c2 = Circulo(4.0)
if c1.raio == c2.raio: 
  print("igual")
else:
  print("diferente")

print ("\nArea: %f" % c1.area())
print ("\nArea: %f" % c2.area())



c1 ---> (raio=4)
c2 ---> (raio=4)


