class Pessoa:

    def __init__(self, nome):
        self.nome = nome
    
    def __str__(self):
        return self.nome
    
    def __eq__(self, other):
        return self.nome == other.nome #a classe string sobrecarrega o método __eq__, por isso == funciona entre strings
    
    def __lt__(self, other):
        return self.nome < other.nome


x = Pessoa('JOAO')
y = Pessoa('JOAO')
z = Pessoa('MARIA')

if x == y:
    print('%s e %s sao a mesma pessoa' % (x, y))

if x < z:
    print('%s vem antes de %s' % (x, z))
