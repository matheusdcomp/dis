class Divisao:

   def __init__(self, a:int, b:int):
      self.n=a
      self.d=b

   def calcula(self):
      return self.n // self.d


class Modulo:

   def __init__(self, a:int, b:int):
      self.n=a
      self.d=b

   def calcula(self):
      return self.n % self.d
      

class DivMod(Divisao,Modulo):

   def __init__(self, a:int, b:int):
      self.n=a
      self.d=b

   def div_mod(self):
      divval = Divisao.calcula(self) #Chama o calcula de DivMod herdado de Divisao
      modval = Modulo.calcula(self) #Chama o calcula de DivMod herdado de Modulo
      return (divval, modval)


#main
x = DivMod(5,2)
d = Divisao(5,2);
d.calcula()
print("Divisao 5/2: ", Divisao.calcula(x)) #Chama calcula de Divisao
print("Modulo 5%2: ", Modulo.calcula(x)) #Chama calcula de Modulo
print("Div & Mod: ", x.div_mod())