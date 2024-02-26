"Este arquivo mostra um exemplo de associação entre classes: Circulo ---> Ponto"

import Ponto as pt

class Circulo:

    def __init__(self, centro, raio):
        self.centro = centro
        self.raio = raio

    def area(self):
        return 3.1415 * self.raio * self.raio
    
    def pertence(self, p):
        return self.centro.distancia(p) <= self.raio

p1 = pt.Ponto(4.0, 6.0)
p2 = pt.Ponto(3.0, 5.0)
c1 = Circulo( p1 , 5.0) 
if c1.pertence(p2):
    print(p2, "pertence ao circulo.")
else:
    print(p2, "nao pertence ao circulo.")
