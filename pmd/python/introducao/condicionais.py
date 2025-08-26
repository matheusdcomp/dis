print()
a = 200
b = 33

if b > a:
  print(f"{b} > {a}")
elif a == b: #elif é o else if de python
  print(f"{a} == {b}")
else:
  print(f"{a} > {b}")

#versão curta do if (sem else)
if a > b: print(f"{a} > {b}")

#versão curta do if-else
print(f"{a} > {b}") if a > b else print(f"{b} >= {a}") 


#if que não faz nada. Pode usar pass em for, while e função também
if b > a: 
  pass
  


#switch do python
day = 4
match day: 
  case 6:
    print("\nSábado")
  case 7:
    print("\nDomingo")
  case _: # _ é o default
    print("\nMeio da semana")


match day:
  case 1 | 2 | 3 | 4 | 5: #cada case pode assumir mais de um valor
    print("\nMeio da semana")
  case 6 | 7:
    print("\nFim de semana")


#Adicionar um if no case funciona como uma condição extra
month = 5
match day:
  case 1 | 2 | 3 | 4 | 5 if month == 4:
    print("\nDia de semana em Abril")
  case 1 | 2 | 3 | 4 | 5 if month == 5:
    print("\nFinal de semana em Maio")
  case _:
    print("Nenhum")


print()