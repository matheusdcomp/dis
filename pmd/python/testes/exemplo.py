import unittest

class TestStringMethods(unittest.TestCase):

  def test_upper(self):
    self.assertEqual('foo'.upper(), 'FOO', "Uppercase não funcionou.")

  def test_isupper(self):
    self.assertTrue('FOO'.isupper(), "FOO deveria ser maiúsculo.");
    self.assertFalse('Foo'.isupper(), "Foo não deveria ser maisúsculo.")

  def test_split(self):
    s = 'hello world'
    self.assertEqual(s.split(), ['hello', 'world'], "split não funciona corretamente.")
    # verfica se s.split gera exceção quando o separador não é uma string
    with self.assertRaises(TypeError):
      s.split(2)


if __name__ == '__main__':
  unittest.main()