"""
Set é uma coleção não ordenada (não tem índices) de elementos não repetidos.
Note que a ordem de armazenamento pode ser diferente do que está escrito. 
Ela pode mudar a cada execução do código.
"""
print()

thisset = {"apple", 7, 10.0, "apple", True, False, 1, 0} #repetições são ignoradas. True/1 e False/0 são repetições.
print(thisset)

#Não é permitido alterar os elementos, mas pode adicionar ou remover
thisset.add("orange")
print(thisset)

thisset.remove("apple") #remove o elemento 7. Dá erro se não existir
print(thisset)

thisset.discard(False) #remove o elemento False. Não dá erro se não existir.
print(thisset)

print()