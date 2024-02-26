from abc import ABC
 
class Pessoa (ABC): 
    def __init__(self, nome):
        self.nome = nome
        super().__init__()

class PFisica (Pessoa):
    def __init__(self, nome, cpf):
        self.cpf = cpf
        super().__init__(nome)


Pessoa('JOAO')