from abc import ABC, abstractmethod
 
class ClasseAbstrata(ABC):
 
    def __init__(self, valor):
        self.valor = valor
        super().__init__()
    
    @abstractmethod
    def metodo(self): pass #pass indica que a função não tem código


class ClasseFilha(ClasseAbstrata):

    def metodo(self):
        return self.valor


y = ClasseAbstrata(1)
x = ClasseFilha(4)
print(x.metodo())
