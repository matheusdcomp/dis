class Calculadora:

  def __init__(self, operando1=0.0, operando2=0.0, operacao="+"):
    self.operando1 = operando1
    self.operando2 = operando2
    self.operacao = operacao
    self.calcular()

  def __str__(self):
    return f"{self.operando1} {self.operacao} {self.operando2} = {self.resultado}"
    #return "%.2f %c %.2f = %.2f" % (self.operando1, self.operacao, self.operando2, self.resultado)

  def calcular(self):
    if self.operacao == "+": 
      self.resultado = self.operando1 + self.operando2
    elif self.operacao == "-": 
      self.resultado = self.operando1 - self.operando2
    elif self.operacao == "*": 
      self.resultado = self.operando1 * self.operando2
    elif self.operacao == "/": 
      self.resultado = self.operando1 / self.operando2



c = Calculadora()
opcao = None
while True:

  opcao = int(input("\n\n0 SAIR\n1 +\n2 -\n3 *\n4 \\\nOpcao:"))

  match opcao:
    case 0:
      exit(0)

    case 1:
      c.operando1 = float(input("Digite o 1o operando: "))
      c.operando2 = float(input("Digite o 2o operando: "))
      c.operacao = "+"
      c.calcular()
      print(c)
      
    