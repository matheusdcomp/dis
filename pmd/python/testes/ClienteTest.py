import unittest

class ClienteTest(unittest.TestCase):

  def setUp(self): #equivalente ao BeforeAll do JUnit
    cliente = Cliente(1,"JOAO")
  
  def tearDown(self): #equivalente ao AfterAll do JUnit
    del self.listaVazia
  
  def test_salvar_ok(self):
    
    dao = EntidadeDAO[Cliente]()
    dao.salvar(cliente)
    self.assertEqual(
      dao.carregar(1).getId(), cliente.getId(), "A lista vazia deve ter 0 elementos")

  def test_IndexError(self):
    with self.assertRaises(IndexError):
      x = self.listaVazia[0]


if __name__ == '__main__':
  unittest.main()
