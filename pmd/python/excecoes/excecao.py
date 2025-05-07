class TesteErro:
    def metodo1(self):
        self.metodo2()

    def metodo2(self):
        array = [1,2,3,4,5]
        for i in range(6):
            print(array[i])
        print('Continua o programa')            

TesteErro().metodo1()