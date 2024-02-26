class Arquivo:
    
    def __init__(self, path='', conteudo='', salvo=False):
        self.path = path
        self.conteudo = conteudo
        self.salvo = salvo
    
    def abrir(self):
        arquivo = open(self.path, 'r')
        self.conteudo = arquivo.read()
        arquivo.close()
        self.salvo = True
    
    def salvar(self):
        arquivo = open(self.path, 'w')
        arquivo.write(self.conteudo)
        arquivo.close()
        self.salvo = True