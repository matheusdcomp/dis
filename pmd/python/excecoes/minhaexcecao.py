class ArgumentoInvalidoException (Exception):
    def __init__(self, arg):
        super().__init__("Argumento invalido: %d" % arg)
try:
    inteiro = int(input("Digite um inteiro: "))
    if inteiro > 10 or inteiro < 0 :
        raise ArgumentoInvalidoException(inteiro) 

except ArgumentoInvalidoException as aie:
    print(aie)