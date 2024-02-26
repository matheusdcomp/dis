class NegativeNumberException (Exception):
  def __init__(self, number):
    super().__init__("'%d' é um número negativo." % number)
  

class EmptyStringException (Exception): pass #fiz vazia para mostrar outra maneira


class Main:

  def fatorial(self, n):
    if n < 0:
      raise NegativeNumberException(n)
    fat = 1
    for f in range(1,n):
      fat *= f
    return fat

  def main(self):
    
    try:
      a = input('Digite um inteiro: ')
      if len(a) == 0:
        raise EmptyStringException()
      a = int(a);  
      print("\nFatorial(%d): %d\n" % (a, self.fatorial(a)))

    except NegativeNumberException as nne:
      print(nne)
    
    except EmptyStringException:
      print("A variável 'a' ficou vazia.")
    
    except ValueError:
      print("\n%s não é um inteiro.\n" % a)


Main().main()