import unittest

class Calculadora:
  @staticmethod
  def soma(a, b):
    return a + b

class CalculadoraTeste(unittest.TestCase):
  def test_soma(self):
    self.assertEqual(3, Calculadora.soma(1,2));

if __name__ == '__main__':
 unittest.main()

# Para executar, digite: 
# python3 calculadora.py -v 

# Para arquivos sem o método main, digite: 
# python3 -m unittest arquivo.py -v

# Para executar vários arquivos de teste no diretório, 
# digite (a string indica um padrão no nome dos arquivos de teste):
# python3 -m unittest discover -p "*.py" -v
