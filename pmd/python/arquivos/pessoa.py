from datetime import date
  
class Pessoa:

  def __init__(self, nome, dtnasc):
    self.nome = nome
    self.dtnasc = dtnasc

  def idade(self):
    hoje = date.today()
    idade = hoje.year - self.dtnasc.year
    if hoje.month < self.dtnasc.month or (hoje.month == self.dtnasc.month and hoje.day < self.dtnasc.day):
      idade -= 1
    return idade

  def __str__(self):
    return "Nome: %s, Data Nasc.: %s, Idade: %d" % (self.nome, self.dtnasc.strftime('%d/%m/%Y'), self.idade())

  @staticmethod
  def fromStr(nome:str, dtnasc:str): #dtnasc precisa estar no formato "%d/%m/%Y"
    dtp = dtnasc.split("/")
    return Pessoa(nome, date(int(dtp[2]), int(dtp[1]), int(dtp[0])))



#main
print("\nARRAY PESSOAS:")
pessoas = [
  Pessoa("JOAO", date(2000,4,30)),
  Pessoa("MARIA", date(2010,11,22)),
  Pessoa("JOSE", date(1999,1,14))
]
for p in pessoas:
  print(p)


#Abrindo arquivo no início para escrita (apaga conteúdo anterior)
with open("pessoas.txt", "w") as arq:
  for p in pessoas:
    arq.write("%s,%s\n" % (p.nome, p.dtnasc.strftime('%d/%m/%Y')))
#Quando se usa with, o arquivo é fechado automaticamente

print("\nARQUIVO:")
#Abrindo arquivo no início para leitura
arq = open("pessoas.txt", "r")
print(arq.read())
arq.close() #Sem with, precisa fechar o arquivo  


#Abrindo arquivo no final para adicionar conteúdo
ana = Pessoa("ANA", date(1997,8,15))
with open("pessoas.txt", "a") as arq:
  arq.write("%s,%s\n" % (ana.nome, ana.dtnasc.strftime('%d/%m/%Y')))

print("ARQUIVO DEPOIS DE ADICIONAR ANA:")
#Abrindo arquivo no início para leitura
with open("pessoas.txt", "r") as arq:
  print(arq.read())


#carrega pessoas do arquivo
with open("pessoas.txt", "r") as arq:
  conteudo = arq.read()

pessoas = []
for linha in conteudo.splitlines():
  if linha != "": #se não for a última linha que fica vazia
    atributos = linha.split(",")
    pessoas.append(Pessoa.fromStr(atributos[0], atributos[1]))

print("ARRAY CARREGADO DO ARQUIVO:")
for p in pessoas:
  print(p)

print()
  