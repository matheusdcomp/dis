class Funcionario:

    def __init__(self, nome='', email=''):
        self.nome = nome
        self.email = email

    def exibeDados(self):
        print('Nome: %s\nEmail: %s' % (self.nome, self.email))