print()#print vazio pula a linha

for a in [1,2,3]:
  print(a) #imprime e pula a linha

print()

for a in [1,2,3]:
  print(a, end=' ') #end=' ' faz com que o print imprima um espaço no final ao invéz de pular linha (\n)


x = input("\n\nDigite uma string: ") #input retorna string
print("x: ", x)

x = int(input("\nDigite um inteiro: ")) #int() converte para int
print("x: ", x)

x = float(input("\nDigite um número: ")) #float() converte para float
print("x: ", x)

print()