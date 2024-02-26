class ItsNotANumberException (Exception):
  def __init__(self, str):
    super().__init__("'%s' não é um número." % str)

class Main:
  @staticmethod
  def main():
    try:
      a = input('Digite um valor: ')
      if not(a.isdigit()):
        raise ItsNotANumberException(a)
    except ItsNotANumberException as e:
      print(e)

Main.main()
