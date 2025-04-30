class Conta:

    def __init__(self, numero=0, saldo=0.0):
        self.__numero = numero 
        self.__saldo = saldo

    def numero(self):
        return self.__numero

    def saldo(self):
        return self.__saldo

    def depositar(self, valor):
        self.__saldo += valor

    def sacar(self, valor):
        if valor > self.__saldo: 
            return False
        else: 
            self.__saldo -= valor
            return True
