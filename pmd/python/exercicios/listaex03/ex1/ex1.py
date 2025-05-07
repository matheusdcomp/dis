class TestaStrings:

  def main(self):
    try:
      
      a = input('Digite uma string: ')
      if len(a) == 0: 
        raise Exception('A string não pode ser vazia.');
      
      b = input('Digite outra string: ')
      if len(b) == 0: 
        raise Exception('A string não pode ser vazia.');
    
    except Exception as e:
      print(e)

    if a == b:
      print('As strings são iguais.')
    elif a < b:
      print('%s vem antes de %s.' % (a, b))
    else:
      print('%s vem antes de %s.' % (b, a))


TestaStrings().main()
