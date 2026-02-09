from abc import ABC, abstractmethod
 
class ClasseAbstrata(ABC):
 
    def __init__(self, valor):
        self.valor = valor
        super().__init__()
    
    @abstractmethod #para a classe ser efetivamente abstrata, precisa ter ao menos um método abstrato
    def metodo(self): pass #pass indica que a função não tem código

    def metodo2(self): pass


class ClasseFilha(ClasseAbstrata):

    def metodo(self):
        return self.valor


y = ClasseAbstrata(1) #Erro: não pode instanciar classe abstrata
x = ClasseFilha(4)
print(x.metodo())
