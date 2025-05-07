from abc import ABC, abstractmethod


class ContaBancaria (ABC):

    def __init__(self, n=0, c='', s=0.0):
        self.numConta = n
        self.cliente = c
        self.saldo = s

    def __str__(self):
        return "\nNumero: %d\nCliente: %s\nSaldo: %.2f" % (self.numConta, self.cliente, self.saldo)    
    
    def sacar(self, valor):
        if valor <= self.saldo:
            self.saldo -= valor
            return True
        return False
    
    def depositar(self, valor):
        self.saldo += valor
    
    @abstractmethod
    def saldo(self): pass


class ContaPoupanca (ContaBancaria):

    def __init__(self, n=0, c='', s=0.0, r=0.0):
        super().__init__(n,c,s)
        self.rendimento = r
    
    def __str__(self):
        return super().__str__() + "\nTaxa de Rendimento: %.2f" % self.rendimento 
    
    def saldo(self):
        self.saldo *= 1 + rendimento
        return self.saldo


class ContaEspecial (ContaBancaria):

    def __init__(self, n=0, c='', s=0.0, l=0.0):
        super().__init__(n,c,s)
        self.limite = l

    def __str__(self):
        return super().__str__() + "\nLimite: %.2f" % self.limite 
    
    def sacar(self, valor):
        if valor <= self.saldo + self.limite:
            self.saldo -= valor
            return True
        return False
    
    def saldo(self):
        return self.saldo