from typing import TypeVar, Generic

K = TypeVar('K')
E = TypeVar('E')

class Mapa(Generic[K,E]):

	def __init__(self):
		self.chaves:list[K] = []
		self.elementos:list[E] = []
	
	def add(self, chave:K, elemento:E):
		self.chaves.append(chave)
		self.elementos.append(elemento)
	

	def rem(self, chave:K)-> E:
		for i in range(len(self.chaves)):
			if self.chave == self.chaves[i]:
				self.chaves.pop(i)
				return self.elementos.pop(i)
		return None

	def __str__(self) -> str:
		sb: str = ""
		for i in range(len(self.chaves)):
			sb += f"({self.chaves[i]}, {self.elementos[i]})\n"
		return sb


mapa = Mapa[int, str]()
mapa.add(1, "JOAO")
mapa.add(2, "JOSE")
mapa.add(3, "ANNA")
print(mapa)

