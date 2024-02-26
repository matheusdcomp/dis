class A:   
  def __init__(self):	      
    print("Construtor de A")

class B (A): pass  
  #def __init__(self):       
  #  print("Construtor de B")

class C:   
  def __init__(self, valor):
    self.valor = valor	
    print("Construtor de C")

class D (C): 
  def __init__(self):
    #super().__init__(valor)  	
    print("Construtor de D")
  def imprime(self, valor):
    self.valor = valor
    print(self.valor)


B()
d = D()
d.imprime(10)
