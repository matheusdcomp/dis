# integer variable.
a=100
print("The type of variable having value", a, " is ", type(a))

# float variable.
c=20.345
print("The type of variable having value", c, " is ", type(c))

# complex variable.
d=10+3j
print("The type of variable having value", d, " is ", type(d))

x = 1
del x
#print ('\nx: ', x) #Se executar essa linha, dá erro: name 'x' is not defined

'''
O comando del apaga o ponteiro, não o objeto. 
Neste exemplo em específico, o comando del apaga o ponteiro x, que aponta para o objeto 1. 
Algum momento depois o coletor de lixo apagará o objeto 1 porque não tem mais ponteiro apontando para ele.
'''
