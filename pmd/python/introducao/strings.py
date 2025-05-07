thanks = 'Thank You!'
print(thanks)
print(thanks[0])  #primeiro caractere da string 
print(thanks[2:7]) #Do 3o ao 7o caractere da string 
print(thanks[4:]) #A partir do 5o caractere da string 
print(thanks * 3) #repete a string 3 vezes
print(thanks + '\tAgain!') #O operador + é concatenação


print("\nstring com aspas duplas aceita 'aspas simples'.")

print('string com aspas simples aceita "aspas duplas".')

print('''\nstring com 3 aspas simples ou duplas 
aceita pular linha e é armazenada/impressa da 
forma que foi escrita.\n''')

"""
string no vazio é tratada como comentário.

Não existe o tipo char em Python. 
Um caractere é uma string de tamanho 1.
E como qualquer string, pode ser escrito
com aspas simples ou dupla.
"""

c = 'a' # mesmo que c = "a"
print(c, "é uma string de tamanho", len(c))

x = 5
print(f"\nstring com f na frente aceita expressões entre chaves: {x}, {1+2}")

print("\nstring seguida de %% e uma tupla aceita valores igual printf do c: %d, %d, %s, %.1f" % (x, 1+2, "'a'", 4.5))

#strings são imutáveis. Não é possível alterar. 
#Operações como concatenação geram uma nova string.
s = "abc"
print("String:", s, "  id:", id(s)) 
s += "d" 
print("String depois de += 'd':", s, "  id:", id(s))


print()