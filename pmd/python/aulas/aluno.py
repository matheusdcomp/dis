class Aluno:
  
  def __init__(self, nome="", matricula=0):
    self.__nome = nome
    self.matricula = matricula 

  def getNome(self):
    return self.__nome

  def setNome(self, nome):
    self.__nome = nome    

  def __str__(self):
    return "Matricula: " + self.matricula + "\tNome: " + self.__nome;


a = Aluno("JOAO", "2026001")
b = Aluno("JOAO", "2026001")

if getNome(a) == b.getNome() and a.matricula == b.matricula:
  print("Aluno a igual ao aluno b.") 
else:
  print("Aluno a diferente do aluno b.") 

print(a)
print(a)