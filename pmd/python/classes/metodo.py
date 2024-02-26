"Este arquivo mostra consequências da passagem de parâmetro por valor nas variáveis (objetos e referências) do Python"

def funcao(v):
    print ('\nvalor de v antes da soma: ', v, "\nid de v antes da soma: ", id(v))
    v += 1
    print ('\nvalor de v depois da soma: ', v, "\nid de v depois da soma: ", id(v))
    return v

a = 5
print ('\nvalor de a antes da funcao: ', a, "\nid de a antes da funcao: ", id(a))
b = funcao(a)
print ('\nvalor de a depois da funcao: ', a, "\nid de a depois da funcao: ", id(a))
print ('\nvalor de b depois da funcao: ', b, "\nid de b depois da funcao: ", id(b))


