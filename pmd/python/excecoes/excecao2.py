
x = input("Digite um numero: ")
y = input("Digite outro numero: ")
a, b, d = 0, 1, 0
try:
    a = int(x)
    b = int(y)		
    d = a / b;
    print("%d / %d = %d" % (a, b, d));

except ValueError:
	print("PAM: Voce nao digitou um numero inteiro.")

except ZeroDivisionError:
	print("PAM: Divisao por 0.")
