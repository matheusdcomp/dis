expo = lambda a : a * a  #A função lambda foi atribuída à variável expo
print(expo(3))

mult = lambda a, b : a * b  #A função lambda foi atribuída à variável mult
print(mult(3,2))

numeros = [1, 2, 3, 4, 5]
dobrados = list(map(lambda x: x * 2, numeros))
print(dobrados)

impares = list(filter(lambda x: x % 2 != 0, numeros))
print(impares)