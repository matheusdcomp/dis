from abc import ABC, abstractmethod
from math import pi, pow

class Geometria (ABC):

    @abstractmethod
    def area(self): pass

    @abstractmethod
    def comprimento(self): pass


class Circulo (Geometria):

    def __init__(self, raio=0.0):
        self.raio = raio
    
    def area(self):
        return pi * pow(self.raio, 2)
    
    def comprimento(self):
        return 2 * pi * self.raio


class Retangulo (Geometria):

    def __init__(self, base=0.0, altura=0.0):
        self.base = base
        self.altura = altura
    
    def area(self):
        return self.base * self.altura
    
    def comprimento(self):
        return 2 * (self.base + self.altura)

