lista = [ 'abcd', 786 , 70.2, 10+3j, True ]
'''
As listas em Python são listas de ponteiros, por isso ela consegue armazenar elementos de tipos diferentes.
Ou seja, [ 'abcd', 786 , 70.2 ] é uma lista de 3 ponteiros que apontam para os objetos 'abcd', 786 e 70.2.
'''

print('\nA lista completa: ', lista)
print('\n3o elemento da lista (lista[2]): ', lista[2])
print('\nÚltimo elemento da lista (lista[-1]): ', lista[-1])
print('\nA lista a partir do 2o elemento (lista[1:]): ', lista[1:])
print('\nA lista do índice 1 ao índice 3 (lista[1:4]): ', lista[1:4])
#Note que lista[1:4] vai do índice 1 ao índice 3 (antes de 4).


print("\nTamanho da lista = len(lista): ", len(lista))

lista[0] = 'defg';
print("\nlista[0] = 'defg': ", lista)

lista.append('novo')
print("\nlista.append('novo'): ", lista)

lista.insert(3, "maisum")
print("\nlista.insert(3, 'maisum'): ", lista)

lista.remove('novo')
print("\nlista.remove('novo'): ", lista)

x = lista.pop()#remove o último elemento e retorna ele
print("\nlista.pop(): ", lista)

y = lista.pop(1)#remove o elemento de índice 1 e retorna ele
print("\nlista.pop(1): ", lista)

del lista[1] #Para listas, é preverível usar pop ou remove
print('\ndel lista[1]: ', lista)
'''
O comando del apaga o ponteiro, não o objeto. Aplica-se qualquer poteiro (variável isolada, elementos de listas, atributos de classes, etc.). 
Neste exemplo em específico, del lista[1] apaga o 2o elemento/ponteiro da lista e a lista diminui de tamanho. 
Depois o coletor de lixo que apaga o objeto porque não tem mais ponteiro apontando para ele.
'''

print('\n3o elemento da lista (lista[2]): ', lista[2])
print('\n3o elemento da lista (lista[2]): ', lista[2])

print() #pula linha
