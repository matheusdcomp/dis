
 
a = 100

print("O tipo da variável tendo o valor ", a, " é ", type(a))


c=20.345
print("O tipo da variável tendo o valor ", c, " é ", type(c))


d=10+3j
print("O tipo da variável tendo o valor ", d, " é ", type(d))

x = 1
del x
print ('\nx: ', x) #Se executar essa linha, dá erro: name 'x' is not defined

'''
O comando del apaga o ponteiro, não o objeto. 
Neste exemplo em específico, o comando del apaga o ponteiro x, que aponta para o objeto 1. 
Algum momento depois o coletor de lixo apagará o objeto 1 porque não tem mais ponteiro apontando para ele.
'''
