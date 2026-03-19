class Circulo:

  def __init__(self, raio=0):
    self.raio = raio 

  def calculaArea(self):
    self.area = 3.1415 * self.raio * self.raio
    

  def volume(self) -> float:
    return 4/3 * self.raio * self.area()

  def __str__():
    return "Raio: " + self.raio


#Escrever instruções que não estão dentro de uma classe ou função é como se fosse o método main
r1 = float(input("Digite o raio: "))
c = Circulo(r1)

r2 = float(input("Digite o segundo raio: "))
a = Circulo(r2)
a.calculaArea()

print ("Volume de c: ", c.volume())
print ("\nArea de a: ", a.area, "   Volume de a: ", a.volume())
