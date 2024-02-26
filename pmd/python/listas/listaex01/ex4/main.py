from datetime import date

from aluno import Aluno
from disciplina import Disciplina
from matricula import Matricula


class Main:

    def __init__(self):
        self.alunos = []
        self.disciplinas = []
        self.matriculas = []
    
    def cadastrarAluno(self):
        r = len(self.alunos) + 1
        n = input('Informe o nome do novo aluno: ')
        self.alunos.append( Aluno(r,n) )
        
    def cadastrarDisciplina(self):
        c = len(self.disciplinas) + 1
        n = input('Informe o nome da nova disciplina: ')
        v = float(input('Informe o valor da nova disciplina: '))
        self.disciplinas.append( Disciplina(c,n,v) )
        
    def cadastrarMatricula(self):
        n = len(self.matriculas) + 1
        d = date.today()
        a = self.buscarAluno(int(input('Informe o registro do aluno: ')))
        ds = []
        while True:
            cd = int(input('Informe o codigo da disciplina: '))
            ds.append(self.buscarDisciplina(cd))
            if input('Deseja incluir outra disciplina na matricula (s/n):') != 's': 
                break
        self.matriculas.append( Matricula(n,d,a,ds) )

    def buscarAluno(self, registro):
        return self.alunos[ (registro - 1) % len(self.alunos) ]
    
    def buscarDisciplina(self, codigo):
        return self.disciplinas[ (codigo - 1) % len(self.disciplinas) ]

    def buscarMatricula(self, numero):
        return self.matriculas[ (numero - 1) % len(self.matriculas) ]
    
    def main(self):
        while True:
            menu =  '\n0 - Sair\n1 - Cadastrar aluno' + \
                    '\n2 - Cadastrar disciplina\n3 - Cadastrar matricula' + \
                    '\n4 - Visualizar matricula\nDigite sua opcao: '

            op = int(input(menu))

            if op == 0:
                return
            
            elif op == 1:
                self.cadastrarAluno()
                print('\nAluno cadastrado com sucesso.\n\n') 
                
            elif op == 2:
                self.cadastrarDisciplina()
                print('\nDisciplina cadastrada com sucesso.\n\n') 
                                
            elif op == 3:
                self.cadastrarMatricula()
                print('\nMatricula cadastrada com sucesso.\n\n') 
                                
            elif op == 4:
                m = self.buscarMatricula(int(input('Informe o numero da matricula: ')))
                print('\n%s\n\n' % m) 
                                
            else:
                print('\nOpcao invalida.\n\n')        


Main().main()