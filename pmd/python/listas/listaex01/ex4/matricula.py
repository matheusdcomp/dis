from datetime import date

from aluno import Aluno
from disciplina import Disciplina


class Matricula:

    def __init__(self, numero=0, data=date.today(), aluno=Aluno(), disciplinas=[]):
        self.numero = numero
        self.data = data
        self.aluno = aluno
        self.disciplinas = disciplinas

    def __str__(self):
        res = '<MATRICULA>\nNumero: %d\nData: %s\nAluno: %s\nDisciplinas:' % \
            (self.numero, self.data.strftime('%d/%m/%Y'), self.aluno)
        for disciplina in self.disciplinas:
            res += '\n%s' % disciplina
        res += '\nTotal: %.2f' % self.calculaTotal()
        return res

    def calculaTotal(self):
        total = 0.0        
        for disciplina in self.disciplinas:
            total += disciplina.valor
        return total
