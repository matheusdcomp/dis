print()

#for em python itera sobre qualquer coleção (lista, tupla, string, set, dicionario)

for letter in 'Python': 
  print(letter)
else: #else do for executa quando o for termina
  print("terminou\n")  


#range(start, stop, step) é uma função que gera uma lista com o valor inicial, final e tamanho do passo

for num in range(5):# de 0 a 4
   print (num, end=' ') #end=' ' faz com que o print imprima um espaço no final ao invéz de pular linha (\n)
print()

for num in range(10, 20):#de 10 a 19
   print (num, end=' ')
print()

for num in range(1, 10, 2): #de 1 a 9 aumentando de 2 em 2
   print (num, end=' ')
print()   


count = 0
while count < 5:
   print(count, " < 5")
   count = count + 1
else: #else do while executa quando o while termina
   print(count, " > 5\n")

#repete até o usuário digitar um dígito 
while (x := input("\nDigite um dígito: ")) not in "0123456789": 
   pass
else: 
   print(f"\nDigitou o dígito: {x}\n") 

'''
Se o conteúdo do for, while ou else for uma única linha, pode ficar na mesma linha

while (x := input("\nDigite um dígito: ")) not in "0123456789": pass
else: print(f"\nDigitou o dígito: {x}\n") 

for num in range(5): print (num, end=' ')
'''