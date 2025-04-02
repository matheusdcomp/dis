class Circulo:

  def __init__(self, raio=0):
    self.raio = raio

  def area(self):
    return 3.1415 * self.raio * self.raio
  

r = 4.0
c1 = Circulo(4.0)
c2 = Circulo(4.0)

if c1 == c2: 
  print("\nc1 e c2 sao o mesmo circulo.")
else:
  print("\nc1 e c2 nao sao o mesmo circulo.")


if c1.raio == c2.raio: 
  print("\nc1 e c2 possuem raios de mesmo tamanho.")
else:
  print("\nc1 e c2 possuem raios de tamanhos diferentes.")

print ("\nArea de c1: %f" % c1.area())
print ("Area de c2: %f" % c2.area())
