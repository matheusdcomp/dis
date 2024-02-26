class MembroPrivado:

  def __init__(self, nome, sobrenome):
    self.nome = nome
    self.__sobrenome = sobrenome

  def imprimir(self):
    print ("\nNome:", self.nome, 
      "\nSobrenome: ", self.__sobrenome)

  
mp = MembroPrivado('JOAO','OLIVEIRA')
mp.imprimir()
print ("\n\nNome: %s" % mp.nome)
print ("\nSobrenome: %s\n" % mp.__sobrenome)



#mp ---> (nome="JOAO", sobrenome="oliveira")
