import unittest

class SampleTest(unittest.TestCase):

  def setUp(self): #equivalente ao BeforeAll do JUnit
    self.listaVazia = []
  
  def tearDown(self): #equivalente ao AfterAll do JUnit
    del self.listaVazia
  
  def test_comportamento(self):
    self.assertEqual(
      len(self.listaVazia), 0, "A lista vazia deve ter 0 elementos")

  def test_IndexError(self):
    with self.assertRaises(IndexError):
      x = self.listaVazia[0]


if __name__ == '__main__':
  unittest.main()
