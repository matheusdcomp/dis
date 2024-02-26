x = input("Digite um numero: ")
y = input("Digite outro numero: ")
a, b, d = 0, 1, 0
try:
    a = int(x)
    b = int(y)		
    d = a / b;
    print("%d / %d = %d" % (a, b, d));

except Exception as e:
	print(e)