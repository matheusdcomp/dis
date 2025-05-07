"""
Dicionários são coleções de elemetos no formato chave:valor.
Assim como arrays, os elementos podem ser alterados, adicionados e removidos.
A partir da versão 3.7 de Python, os dicionários passaram a ser ordenados (os elementos são armazenados na mesma ordem que são declarados).
As chaves são únicas (não podem repetir), mas os valores podem repetir. 
As chaves e valores podem ser de qualquer tipo e podem variar de tipo dentro do mesmo dicionário.
"""

d =	{ "a": "joao", "b": "maria", 3: "jose" }
print(d)

print("\nd['a']: ", d["a"])

print("\nChaves:")
for k in d.keys():
  print(k, end=' ') #end=' ' faz com que o print imprima um espaço no final ao invéz de pular linha (\n)

print("\nValores:")
for v in d.values():
  print(v, end=' ')

print("\nItens:")
for i in d.items(): #items() retorna uma lista de tuplas (chave,valor)
  print(i, end=' ')  

d.update({'a':'matheus'}) #altera o valor na chave "a"
print("\nd.update({'a':'matheus'}): ", d)

d["c"] = 7 #ou d.update({"c":7})adiciona um novo elemento "c":7
print("\nAdicionado ('c':7): ", d)

d.pop("c") #reomve o elemento com chave "c"
print("\nRemovido ('c':7): ", d)

print()