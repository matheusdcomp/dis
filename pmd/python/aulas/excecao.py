class DigitouErradoException (Exception):
  def __init__(self, arg):
    super().__init__(f"Digitou um valor inválido: {arg}")

class Calculadora:

  def fatorial(self,a):
    return self.fatorial_(a,1)

  def fatorial_(self, a, f):
    if a <= 1: return f
    return self.fatorial_(a-1, a*f)

  def inputInt(self):
    x = input("Digite um inteiro: ")
    if not x.isdigit():
      raise DigitouErradoException(x)
    return int(x)
  
  def main(self):
    a = 0
    while True:
      try:
        a = self.inputInt()
        break
      except DigitouErradoException as e:
        print(e)        
    print("Fatorial de", a, ":", self.fatorial(a))
      

Calculadora().main()