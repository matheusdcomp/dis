
class Aluno:
  def __init__(self, ra=0, nome=""):
    self.ra = ra
    self.nome = nome
  def __str__(self):
    return f"Nome: {self.nome}\tRA: {self.ra}"

class Disciplina:
  def __init__(self, ch=0, nome="", prof=""):
    self.ch = ch
    self.nome = nome
    self.prof = prof
  def __str__(self):
    return f"Nome: {self.nome}\tProf(a): {self.prof}\tCH: {self.ch}"

class Matricula:

  def __init__(self, num, aluno, disciplinas):
    self.num = num
    self.aluno = aluno
    self.disciplinas = disciplinas

  def __str__(self):
    s = f"Numero: {self.num}\nAluno: {self.aluno.nome}"
    for d in self.disciplinas:
      s += f"\nDisciplina: {d.nome}"
    return s  

  def addDisciplina(self, disciplina):
    self.disciplinas.insert(0,disciplina)   

  def remDisciplina(self, disciplina):
    self.disciplinas.remove(disciplina)       

  def remDisciplinaPorNome(self, nome):
    self.disciplinas = [d for d in self.disciplinas if d.nome != nome]    
            

alunos = []
disciplinas = []
matriculas = []

while True:
  print(
    """
      0 SAIR
      1 CAD ALUNO
      2 CAD DISCIPLINA
      3 CAD MATRICULA
    """
  )
  opcao = int(input("Digite a sua opcao: "))

  if opcao == 0:
    break
  elif opcao == 1:
    ra = int(input("Digite o RA: "))
    nm = input("Digite o nome: ")
    alunos.append(Aluno(ra,nm)) 
    for a in alunos:
      print(a)
      
  elif opcao == 2:
    ch = int(input("Digite a carga horaria: "))
    nm = input("Digite o nome: ")
    pf = input("Digite o(a) professor(a): ") 
    disciplinas.append(Disciplina(ch,nm,pf)) 
    for d in range(len(disciplinas)):
      print(disciplinas[d])

  elif opcao == 3:
    num = int(input("Digite o numero: "))
    ra = int(input("Digite o RA do(a) aluno(a): "))
    al = [a for a in alunos if a.ra == ra] 
    mat = Matricula(num, al[0], [])
    while True:
      nd = input("Informe o nome da disciplina ou 0 para parar: ")
      if nd == "0": break
      for d in disciplinas:
        if d.nome == nd:
          mat.addDisciplina(d) 
    matriculas.append(mat)      
    for m in matriculas:
      print(m)  

