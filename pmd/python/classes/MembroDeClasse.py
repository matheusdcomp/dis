class MinhaClasse:
    
    qtd_objetos = 0 

    def __init__(self, at_instancia):
      self.at_instancia = at_instancia
      MinhaClasse.qtd_objetos += 1
    
    def metodoInstancia(self):
        print('\nMetodo da instancia ', self)

    @classmethod
    def metodoClasse(cls):
        print('\nMetodo da classe ', cls)
        print('\nQuantidade de objetos: ', MinhaClasse.qtd_objetos)

    @staticmethod
    def metodoEstatico():
        print('\nMetodo estatico')
        print('\nMetodo da classe ', __class__)

mc = MinhaClasse(1)
mc.metodoInstancia()
print('Atributo de mc: ', mc.at_instancia)
MinhaClasse.metodoClasse()
MinhaClasse.metodoEstatico()

mc = MinhaClasse(1) 
MinhaClasse.metodoClasse()