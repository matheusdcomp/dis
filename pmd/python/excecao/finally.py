class TestaFinallyReturn:
    def testa(self):
        try:
            print("TRY")
            a = 5 / 0 #exceção
            return
        except:
            print("EXCEPT")
            return
        finally:
            print("FINALLY")
    
    def main(self):
        print("MAIN INICIO")
        self.testa()
        print("MAIN FIM")

TestaFinallyReturn().main()