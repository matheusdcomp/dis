from abc import ABC, abstractmethod
 
class Pessoa (ABC): 
    def __init__(self, nome):
        self.nome = nome
        super().__init__()
    @abstractmethod
    def documento(self): pass    

class PFisica (Pessoa):
    def __init__(self, nome, cpf):
        self.cpf = cpf
        super().__init__(nome)
    def documento(self):
        return self.cpf    


PFisica('JOAO', '12345678910')