from funcionario import Funcionario


class Assistente (Funcionario):

    def __init__(self, nome='', email='', matricula=0):
        super().__init__(nome, email)
        self.matricula = matricula

    def exibeDados(self):
        super().exibeDados()
        print('Matricula: %d' % self.matricula)


class AssistenteTecnico (Assistente):

    def __init__(self, nome='', email='', matricula=0, bonus=0.0):
        super().__init__(nome, email, matricula)
        self.bonus = bonus

    def exibeDados(self):
        super().exibeDados()
        print('Bonus: %.2f' % self.bonus)


class AssistenteAdministrativo (Assistente):

    def __init__(self, nome='', email='', matricula=0, turno='dia'):
        super().__init__(nome, email, matricula)
        self.turno = turno

    def exibeDados(self):
        super().exibeDados()
        print('Turno: %s' % self.turno)
