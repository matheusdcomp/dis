class Circulo:

  def setRaio(self, raio):
    self.raio = raio


  def area(self):
    return 3.1415 * self.raio * self.raio

'''
Em Python, quando uma classe não tem método construtor ou
o método construtor dela não declara nenhum atributo, os 
objetos dessa classe são criados sem atributos.  

Atributos de instância são criados dentro dos objetos no
momento em que a linha onde esse atributo foi declarado é 
executada. Isso pode acontecer dentro ou fora da classe.

Por causa disso, em Python, é possível que objetos da mesma
classe possuam uma quantidade diferente de atributos.
'''

c1 = Circulo()  #Circulo não tem construtor, portanto, por enquanto, o objeto c1 não tem atributos. 
c2 = Circulo()  #Circulo não tem construtor, portanto, por enquanto, o objeto c2 não tem atributos. 
c1.setRaio(4.0) #O método setRaio inicializa o atributo raio, a partir de agora o objeto c1 possui um atributo raio com valor 4, mas o objeto c2 continua sem nenhum atributo.
print(c1.raio)  #Imprime o valor do atributo raio do objeto c1
print ("Area de c1: ", c1.area()) #Calcula a área e o volume do objeto c1
c1.x = 5
print("x de c1: ", c1.x)

print(c2.raio) #dá erro, pois c2 não tem o atributo raio, uma vez que o método setRaio não foi chamado para esse objeto 
print("O objeto c2 tem um atributo x com valor: ", c2.x) #dá erro, pois c2 não tem o atributo x, uma vez que esse atributo não foi declarado para esse objeto 
