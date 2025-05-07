"""
Tupla é uma coleção imutável de valores de qualquer tipo.
Imutável significa que não é possível alterar seu conteúdo nem tamanho.
A vantagem é que a tupla é mais rápida que um array.
Assim como arrays, uma tupla não armazena valores/objetos, mas sim os ponteiros que apontam para esses valores.
"""

t = ("abc", [1,2], 3, 4.5) #tupla com 4 elementos: string, list, int e float 
print("\nTupla t:", t)

print("\nt[2:5]:", t[2:5]) #imprime do 3o ao 4o (5-1) elemento

x,y,z = 1,2,3 #Equivale à atribuição de tuplas: (x,y,z) = (1,2,3) 
print(f"\nx: {x}  y: {y}  z: {z}")

t1 = ("a",) #Para criar uma tupla com apenas um elemento, é necessário incluir a vírgula para diferenciar de um valor entre parênteses.
print("\nTupla de um elemento:", t1)


print("\nt[2]:", t[2])

#t[2] = 6 %dá erro pois não pode alterar um elemento

t[1][0] = 6 #altera o 1o elemento da lista q é o 2 elemento
print("\nTupla t depois de t[1][0] = 6:", t)
#É possível alterar a lista dentro da tupla porque alterar uma lista não gera uma nova lista, então a tupla não é alterada

#Para alterar um tupla, primeiro converta-a em uma lista
lista = list(t) #cria uma lista com os elementos da tupla t
print("\nLista com os elementos da tupla t:", lista)

#Operador + concatena tuplas, gerando uma nova tupla
print('\n(1,"x") + (10.0, False):', (1,"x") + (10.0, False))

#Multipicar um tupla por x gera um nova tupla com x concatenções da original  
print('\n(1,"x") * 2:',(1,"x") * 2)

#count retorna a quantidade de ocorrências de um valor
x = (1,2,3,1,2,1)
print(f"\nQuantos 1's em {x}: {x.count(1)}")

print()