class TestaArray:

  def main(self):
       
    a = input('Digite um inteiro: ')      
    divisores = []

    try:
      for d in range(1,a):
        if a % d == 0:
          if len(divisores) < 10:
            divisores.append(d)
          else:
            raise IndexError("%d possui mais de 10 divisores" % a)
        
    except IndexError as e:
      print(e)
      

TestaArray().main()
