class Ponto:
  def __init__(self, x=0, y=0):
    self.x = x
    self.y = y
  def distancia(self, p):
    return (self.x - p.x)**2 + (self.y - p.y)**2
  def __str__(self):
    return '(%.1f, %.1f)' % (self.x, self.y)

pnt = Ponto(1,2)

import inspect

print('Ponto é uma classe? ', inspect.isclass(Ponto))
print('distancia é uma função? ', inspect.isfunction(Ponto.distancia))
print('distancia é um método? ', inspect.ismethod(pnt.distancia))


atributos = inspect.getmembers(pnt, lambda m: not inspect.ismethod(m))
print('Atributos:')
for n, v in [a for a in atributos if not a[0].startswith('__')]:
  print('Nome: ', n)#, '  Valor: ', v, '  Tipo: ', type(v))

print('Metodos:')
metodos = inspect.getmembers(pnt, inspect.ismethod)
for n, v in metodos:
  print('Nome: ', n, '  Tipo: ', type(v))