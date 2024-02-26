lista = [ 'abcd', 786 , 70.2 ]
print ('\nvalor de lista[0]: ', lista[0],  "\nid de lista[0] antes de trocar o valor: ", id(lista[0]))
lista[0] = 'defg';
print ('\nvalor de lista[0]: ', lista[0], "\nid de lista[0] depois de trocar o valor: ", id(lista[0]))

print ('\nid da lista: ', id(lista))
lista.append('novo')
print ('\nid da lista depois de adicionar um novo elemento: ', id(lista))
del lista[1]
print ('\nid da lista depois de remover um elemento: ', id(lista))