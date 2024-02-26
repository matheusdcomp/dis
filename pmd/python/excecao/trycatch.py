class TesteErro:
    def metodo1(self):
        self.metodo2()

    def metodo2(self):
        array = [1,2,3,4,5]
        try:
            for i in range(6):
                print(array[i])
        except IndexError:
            print('\nPAM: indice invalido.')
        print('\nFim do método 2')            

TesteErro().metodo1()