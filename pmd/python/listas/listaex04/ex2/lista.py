class NodoLista:
  
  def __init__(self, dado = None, prox = None):
    self.dado = dado
    self.prox = prox
  
  def __str__(self):
    return str(self.dado)


class Lista:

  def __init__(self):
    self.inicio = None
    self.tam:int = 0

  def add(self, dado:NodoLista, index:int = 0):    
    if index < 0 or index > self.tam:
      print("\nPosição inválida: %d" % index)
      return    
    if index == 0:
      self.inicio = NodoLista(dado,self.inicio)    
    else:
      atual = self.inicio
      for i in [0..index-1]:
        atual = atual.prox
      atual.prox = NodoLista(dado,atual.prox)  
    self.tam += 1	

  def indexOf(self, dado) -> int:
    atual = self.inicio
    for i in [0..self.tam-1]:
      if atual.dado == dado:
        return i
    return -1  

  def remove(self, index:int = 0):    
    if index < 0 or index > self.tam - 1:      
      print("\nPosição inválida: %d" % index)
      return
    dado = None
    if index == 0:
      dado = self.inicio.dado
      self.inicio = self.inicio.prox    
    else:
      atual = self.inicio
      for i in [0..index-1]:
        atual = atual.prox
      dado = atual.prox.dado
      atual.prox = atual.prox.prox    
    self.tam -= 1    
    return dado	

  def __str__(self):
    atual = self.inicio
    saida = ""
    for i in [0..self.tam-1]:
      saida += atual + " "
      atual = atual.prox
    return saida


print("\n\nLISTA DE INTEIROS\n")
lint = Lista();
lint.add(0, 1);
lint.add(1, 2);
lint.add(2, 4);
lint.add(2, 3);
print(str(lint));
print("Index do 4: " + lint.indexOf(4));
lint.remove(1);
print(str(lint));

print("\n\nLISTA DE STRINGS\n");
lstr = Lista();
lstr.add(0, "A");
lstr.add(1, "B");
lstr.add(2, "D");
lstr.add(2, "C");
print(str(lint));
print("Index do C: " + lstr.indexOf("C"));
lstr.remove(1);
print(str(lint));
