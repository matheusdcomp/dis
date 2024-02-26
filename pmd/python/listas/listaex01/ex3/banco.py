'''
Por padrão, o python só procura arquivos na pasta do arquivo atual, 
na pasta onde o comando python é executado e na biblioteca (syspath).
O comando sys.path.insert insere uma nova pasta em tempo de execução.
A pasta atual fica na posição 0, então acrescentei a nova pasta na posição 1. 
'''
import sys
sys.path.insert( 1, '../ex2' )
#agora pode importar conta que fica na pasta ex2 (mesmo nível que ex3, onde está este arquivo)
from conta import Conta

class Banco:

    def __init__(self):
        self.contas = []
    
    def addConta(self, conta):
        self.contas.append(conta)
    
    def buscarConta(self, numero):
        for conta in self.contas:    
            if numero == conta.numero():
                return conta
        return None
    
     
