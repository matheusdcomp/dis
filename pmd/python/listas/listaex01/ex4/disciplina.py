class Disciplina:

    def __init__(self, codigo=0, nome='', valor=0.0):
        self.codigo = codigo
        self.nome = nome
        self.valor = valor
    
    def __str__(self):
        return '\tCodigo: %d\tNome: %s\tValor: %.2f' % (self.codigo, self.nome, self.valor)
    