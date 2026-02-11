class Ponto:
  def __init__(self, x=0, y=0):
    self.x = x
    self.y = y
  def distancia(self, p):
    return (self.x - p.x)**2 + (self.y - p.y)**2
  def __str__(self):
    return '(%.1f, %.1f)' % (self.x, self.y)

pnt = Ponto(1,2)

print('Tipo da classe Ponto: ', type(Ponto))
print('Tipo do objeto pnt: ', type(pnt))

print('Possui atributo x: ', hasattr(pnt,'x'))
setattr(pnt,'x',3)
print('Atributo x depois de alterar: ', getattr(pnt,'x'))


membros = dir(pnt) #como pnt é um objeto, dir retorna os membros de instância

print('Atributos:')
for a in [atr for atr in membros if not callable(getattr(pnt, atr))]:
  print('  ', a)

print('Metodos:')
for m in [mtd for mtd in membros if not mtd.startswith('__') and callable(getattr(pnt, mtd))]:
  print('  ', m)

print('\nAtributos usando __dict__:')
print(pnt.__dict__.keys())    
print(pnt.__dict__.values())