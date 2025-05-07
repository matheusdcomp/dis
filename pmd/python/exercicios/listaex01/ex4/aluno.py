class Aluno:

    def __init__(self, registro=0, nome=''):
        self.registro = registro
        self.nome = nome
    
    def __str__(self):
        return '\tRegistro: %d\tNome: %s' % (self.registro, self.nome)
    
    



