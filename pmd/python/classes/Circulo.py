class Circulo:

  def __init__(self, raio):
    self.raio = raio 

  def area(self):
    return 3.1415 * self.raio * self.raio

  def volume(self):
    return 4/3 * self.raio * self.area()

c = Circulo(4.0)
a = Circulo(10.0)
print ("\nArea de c: ", c.area(), "   Volume de c: ", c.volume())
print ("\nArea de a: ", a.area(), "   Volume de a: ", a.volume())


